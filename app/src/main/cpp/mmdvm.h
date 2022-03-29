#include <jni.h>
#include <android/log.h>
#include <android/ndk-version.h>
#include <string>
#include <opencl-c-base.h>

#ifdef __cplusplus
extern "C" {
#endif

namespace BeOn {
    class IBeOnExtendedCore {
    };

    class VoiceProcessor {
    };

    class IBeOnVocoder {
    };

    class AmbeVocoder {
    public:
        AmbeVocoder(short mode);

        ~AmbeVocoder();

        void decodeInit();

        void encodeInit();

        unsigned long long decode(uchar *, int, short *);

        unsigned long long unpackBytesToBits(short *a, unsigned char const *b, int c, int d);
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

#ifdef __cplusplus
}
#endif