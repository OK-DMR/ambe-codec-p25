#include <jni.h>
#include <android/log.h>
#include <string>
#include <sstream>
#include <iomanip>
#include <vector>
#include <inttypes.h>
#include <oboe/Oboe.h>
#include <queue>

#ifdef __cplusplus
extern "C" {
#endif

using namespace oboe;

const int rY[36] = {
        0, 2, 0, 2, 0, 2,
        0, 2, 0, 3, 0, 3,
        1, 3, 1, 3, 1, 3,
        1, 3, 1, 3, 1, 3,
        1, 3, 1, 3, 1, 3,
        1, 3, 1, 3, 1, 3
};

const int rZ[36] = {
        5, 3, 4, 2, 3, 1,
        2, 0, 1, 13, 0, 12,
        22, 11, 21, 10, 20, 9,
        19, 8, 18, 7, 17, 6,
        16, 5, 15, 4, 14, 3,
        13, 2, 12, 1, 11, 0
};


const int rW[36] = {
        0, 1, 0, 1, 0, 1,
        0, 1, 0, 1, 0, 1,
        0, 1, 0, 1, 0, 1,
        0, 1, 0, 1, 0, 2,
        0, 2, 0, 2, 0, 2,
        0, 2, 0, 2, 0, 2
};

const int rX[36] = {
        23, 10, 22, 9, 21, 8,
        20, 7, 19, 6, 18, 5,
        17, 4, 16, 3, 15, 2,
        14, 1, 13, 0, 12, 10,
        11, 9, 10, 8, 9, 7,
        8, 6, 7, 5, 6, 4
};


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
        AmbeVocoder(short mode = 1);

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
        pAmbeVocoder = new BeOn::AmbeVocoder(AmbeVocoderRate::HALF_RATE);
        pAmbeVocoder->disablePostDecodeCompression();
        pAmbeVocoder->encodeInit();
        pAmbeVocoder->decodeInit();
        __android_log_print(ANDROID_LOG_WARN, "OboePlayer::OboePlayer",
                            "AmbeVocoder type:%d sample-rate:%d max-frame-length:%d max-frame-length-in-bytes:%d",
                            pAmbeVocoder->getType(), pAmbeVocoder->getSampleRate(),
                            pAmbeVocoder->getMaxFrameLength(),
                            pAmbeVocoder->getMaxEncodedFrameLengthInBytes()
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
            mBuffer.push(static_cast<short>(samples[i]));
        }
    }

    void addAmbeSamples(unsigned char const *ambeData) {
        short decoded[160] = {0};
        uint64_t decode_ret = pAmbeVocoder->decode(ambeData, 0, decoded);
        __android_log_print(ANDROID_LOG_WARN, "OboePlayer::addAmbeSamples",
                            "pAmbeVocoder->decode returned %lu", decode_ret);
        this->addSamples(decoded, decode_ret);
    }

private:
    std::mutex mStreamLock;
    std::mutex mBufferLock;
    std::shared_ptr<oboe::AudioStream> mStream;
    std::queue<int16_t> mBuffer;
    BeOn::AmbeVocoder *pAmbeVocoder;

};

OboePlayer *globalPlayer;

#ifdef __cplusplus
}
#endif