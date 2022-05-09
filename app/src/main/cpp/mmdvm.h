#include <jni.h>
#include <android/log.h>
#include <string>
#include <sstream>
#include <iomanip>
#include <vector>
#include <inttypes.h>
#include <oboe/Oboe.h>
#include <queue>

#include "vocoder_plugin.h"

#ifdef __cplusplus
extern "C" {
#endif

using namespace oboe;

class IBeOnVocoder;

int32_t
ambe_voice_dec(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int16_t a5, int16_t a6, int32_t a7);
int32_t
ambe_voice_enc(int32_t a1, int32_t a2, int32_t a3, int32_t a4, int16_t a5, int16_t a6, int16_t a7,
               int32_t a8);
/*
 * dvsi_fxmemset(mempointer,0,0x3F6)
 * mempointer[0x7c6] = 0xFFE2
 * mempointer[0x7c2] = 0x1C94
 * ambe_tone_gen(mempointer,0x20, 0xFFFFFFF6)
 * init_frame(mempointer + 0x474)
 * init_frame(mempointer + 0x4FC)
 *
 *
 * */
void ambe_init_dec(int mempointer, uint32_t, uint32_t, uint32_t);
/*
 *
 * returns the same mempointer it was passed
 * */
int *dvsi_fxmemset(int *mempointer, unsigned short, int memory_length);
uint32_t ambe_tone_gen(int, uint32_t, uint32_t);
/*
 * data[2] = 0xE
 * data[1] = 0xFF
 * *data = 2
 * data[64] = 0
 * data[4] = 0
 * data[7] = 0
 * data[6] = 0x4000
 * dvsi_fxmemset(data+8, 0x6666, 0x38)
 * data[66] = 0xFFFF
 * data[67] = 0xFFEE
 * */
void init_frame(uint16_t *data);
enum BbPttLogLevel {
    TRACE = 0,
    DEBUG = 1,
    INFO = 2,
    WARN = 3,
    ERROR = 4,
    NONE = 5
};
void setBbPttCoreLogLevel(uint32_t logLevel);

enum AmbeVocoderRate {
    FULL_RATE = 0,
    HALF_RATE = 1
};

namespace BeOn {
    class IBeOnExtendedCore {
    };

    class VoiceProcessor {
    };

    class AmbeVocoder {
    public:
        /*
         * mode (0 => type 7 - FULL_RATE, 1+ => type 13 - HALF_RATE)
         * sample rate always 8000
         * max-frame-length always 160
         * max-frame-length-in-bytes (FULL_RATE => 11 bytes, HALF_RATE => 7 bytes)
         * */
        AmbeVocoder(short mode);

        ~AmbeVocoder();

        void decodeInit();

        void encodeInit();

        void enablePostDecodeCompression(float, float, float, float);

        void disablePostDecodeCompression();

        /*
         * does
         * 1) (volitelně) ambe_tone_gen
         * 2) unpackBytesToBits
         * 3) ambe_voice_dec
         * 4) ambe_voice_dec (again)
         * 5) Compressor:compress
         * 6) return (number of short samples returned)
         * */
        uint64_t decode(unsigned char const *input_bytes, int unused, short *output_shorts);

        uint64_t
        unpackBytesToBits(short *a, unsigned char const *b, int numberOfBytes, int numberOfBits);

        uint64_t packBitsToBytes(short *, unsigned char *, int, int);

        uint32_t getSampleRate() const;

        uint32_t getMaxFrameLength() const;

        uint32_t getMaxEncodedFrameLengthInBytes() const;

        uint32_t getType() const;
    };

    class VoiceEncoderBase {
        ~VoiceEncoderBase();

        VoiceEncoderBase(BeOn::IBeOnExtendedCore *, BeOn::VoiceProcessor *, IBeOnVocoder *,
                         std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >);
    };

    class VoiceDecoderAmbeHalfRate {
        VoiceDecoderAmbeHalfRate(BeOn::IBeOnExtendedCore *, BeOn::VoiceProcessor *, IBeOnVocoder *);
        //tryToGetCryptoSync(BeOn::IVoiceDecrypter*, unsigned char, int);
        //decodePdu(unsigned char*, int);
        //decryptDummyPdu(BeOn::IVoiceDecrypter*, unsigned char);
        //decryptAndDecodeLdu4V_3(BeOn::IVoiceDecrypter*, int*);
        //decryptAndDecodeLdu4V_1(BeOn::IVoiceDecrypter*, int*);
        //getSilenceBufferSize();
        //decryptAndDecodeLdu4V_U(BeOn::IVoiceDecrypter*, int*);
        //getVocoderType();
    };

    class VoiceDecoderAmbeFullRate {

    };
}

class OboePlayer : public oboe::AudioStreamDataCallback, oboe::AudioStreamErrorCallback {
public:
    oboe::DataCallbackResult
    onAudioReady(oboe::AudioStream *oboeStream, void *audioData, int32_t numFrames) override {
        std::lock_guard<std::mutex> lock(mBufferLock);
        //__android_log_print(ANDROID_LOG_WARN, "OboePlayer::onAudioReady",
        //                    "numFrames: %d", numFrames);
        int16_t *i16data = (int16_t *) audioData;
        auto rtn = DataCallbackResult::Continue;

        for (int i = 0; i < numFrames; i++) {
            if (!mBuffer.empty()) {
                i16data[i] = mBuffer.front();
                mBuffer.pop();
            } else {
                rtn = DataCallbackResult::Stop;
            }
        }

        return rtn;
    };

    virtual ~OboePlayer() = default;

    OboePlayer() {
        __android_log_print(ANDROID_LOG_WARN, "OboePlayer::OboePlayer",
                            "constructor");
        starVocoder = new VocoderPlugin();
        beonVocoder = new BeOn::AmbeVocoder(AmbeVocoderRate::HALF_RATE);
        //beonVocoder->disablePostDecodeCompression();
        beonVocoder->encodeInit();
        beonVocoder->decodeInit();
        __android_log_print(ANDROID_LOG_WARN, "OboePlayer::OboePlayer",
                            "AmbeVocoder type:%d sample-rate:%d max-frame-length:%d max-frame-length-in-bytes:%d",
                            beonVocoder->getType(), beonVocoder->getSampleRate(),
                            beonVocoder->getMaxFrameLength(),
                            beonVocoder->getMaxEncodedFrameLengthInBytes()
        );
    }

    int32_t prepareAudio() {
        __android_log_print(ANDROID_LOG_WARN, "OboePlayer::startAudio",
                            "prepareAudio");
        std::lock_guard<std::mutex> lock(mStreamLock);
        oboe::AudioStreamBuilder builder;
        oboe::Result result = builder.setPerformanceMode(oboe::PerformanceMode::LowLatency)
                ->setDirection(oboe::Direction::Output)
                ->setSharingMode(oboe::SharingMode::Shared)
                ->setFormat(oboe::AudioFormat::I16)
                ->setChannelCount(oboe::ChannelCount::Mono)
                ->setSampleRate(8000)
                ->setSampleRateConversionQuality(SampleRateConversionQuality::Medium)
                ->setDataCallback(this)
                ->openStream(mStream);

        return (int32_t) result;
    };

    int32_t startAudio() {
        __android_log_print(ANDROID_LOG_WARN, "OboePlayer::startAudio",
                            "startAudio");
        std::lock_guard<std::mutex> lock(mStreamLock);
        return (int32_t) (mStream == NULL ? Result::ErrorNull : mStream->requestStart());
    }

    void addSamples(short const samples[], uint16_t const amount) {
        __android_log_print(ANDROID_LOG_WARN, "OboePlayer::addSamples",
                            "addSamples amount:%d", amount);
        std::lock_guard<std::mutex> lock(mBufferLock);
        for (int i = 0; i < amount; i++) {
            //__android_log_print(ANDROID_LOG_WARN, "OboePlayer::addSamples", "short value %d", samples[i]);
            mBuffer.push(samples[i]);
        }
    }

    void addAmbeSamples(unsigned char ambeData[9]) {
        int16_t pcm[160] = {0};
        starVocoder->decode_2450x1150(pcm, ambeData);
        //uint64_t decode_ret = beonVocoder->decode(ambeData, 0, pcm);
        //__android_log_print(ANDROID_LOG_WARN, "OboePlayer::addAmbeSamples",
        //                    "beonVocoder->decode returned %lu", decode_ret);
        //this->addSamples(pcm, decode_ret);
    }

private:
    std::mutex mStreamLock;
    std::mutex mBufferLock;
    std::shared_ptr<oboe::AudioStream> mStream;
    std::queue<int16_t> mBuffer;
    BeOn::AmbeVocoder *beonVocoder;
    VocoderPlugin *starVocoder;

};

OboePlayer *globalPlayer;

#ifdef __cplusplus
}
#endif