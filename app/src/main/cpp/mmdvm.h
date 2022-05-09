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

    void addSamples(short const samples[], uint32_t const amount) {
        //__android_log_print(ANDROID_LOG_WARN, "OboePlayer::addSamples",
        //                    "addSamples amount:%d", amount);
        std::lock_guard<std::mutex> lock(mBufferLock);
        for (int i = 0; i < amount; i++) {
            //if (samples[i] > 0) {
            //    __android_log_print(ANDROID_LOG_WARN, "OboePlayer::addSamples", "short value %d",
            //                        samples[i]);
            //}
            mBuffer.push(samples[i]);
        }
    }

    void addAmbeSamples(unsigned char ambeData[9]) {
        int16_t *pcm = new int16_t[160];
        starVocoder->decode_2450x1150(pcm, ambeData);
        this->addSamples(pcm, 160);
    }

private:
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