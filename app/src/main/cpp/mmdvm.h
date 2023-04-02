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
        starVocoder = new VocoderPlugin();
    }

    int32_t prepareAudio() {
        if (audioPrepared && mStream->getState()) {
            return (int32_t) oboe::Result::OK;
        }

        __android_log_print(ANDROID_LOG_WARN, "OboePlayer::startAudio",
                            "prepareAudio");
        std::lock_guard<std::mutex> lock(mStreamLock);
        oboe::AudioStreamBuilder builder;
        oboe::Result result = builder.setUsage(Usage::Media)
                ->setDirection(oboe::Direction::Output)
                ->setSharingMode(oboe::SharingMode::Shared)
                ->setFormat(oboe::AudioFormat::I16)
                ->setChannelCount(oboe::ChannelCount::Mono)
                ->setSampleRate(8000)
                ->setContentType(ContentType::Speech)
                ->setDataCallback(this)
                ->openStream(mStream);

        audioPrepared = result == oboe::Result::OK;

        return (int32_t) result;
    };

    int32_t startAudio() {
        __android_log_print(ANDROID_LOG_WARN, "OboePlayer::startAudio",
                            "startAudio");
        std::lock_guard<std::mutex> lock(mStreamLock);
        return (int32_t) (mStream == NULL ? Result::ErrorNull : mStream->requestStart());
    }

    void addSamples(short const samples[], uint32_t const amount) {
        std::lock_guard<std::mutex> lock(mBufferLock);
        for (int i = 0; i < amount; i++) {
            mBuffer.push(samples[i] & 0xFFFF);
        }
    }

    void addAmbeSamples(unsigned char ambeData[9]) {
        int16_t *pcm = new int16_t[160];
        //__android_log_print(ANDROID_LOG_WARN, "OboePlayer::addAmbeSamples",
        //                    "%d:%d:%d:%d:%d:%d:%d:%d:%d", ambeData[0], ambeData[1], ambeData[2], ambeData[3], ambeData[4], ambeData[5], ambeData[6], ambeData[7], ambeData[8]);
        starVocoder->decode_2450x1150(pcm, ambeData);
        this->addSamples(pcm, 160);
    }

private:
    bool audioPrepared = false;
    std::mutex mStreamLock;
    std::mutex mBufferLock;
    std::shared_ptr<oboe::AudioStream> mStream;
    std::queue<int16_t> mBuffer;
    VocoderPlugin *starVocoder;

};

OboePlayer *globalPlayer;

#ifdef __cplusplus
}
#endif