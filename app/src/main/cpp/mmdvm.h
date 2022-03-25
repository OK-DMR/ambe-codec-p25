#include <jni.h>

#ifdef __cplusplus
extern "C" {
#endif

namespace BeOn {
    class AmbeVocoder {
    public:
        AmbeVocoder(short mode);

        ~AmbeVocoder();

        void decodeInit();

        void encodeInit();

        unsigned long long unpackBytesToBits(short* a, unsigned char const* b, int c, int d);
    };
}

#ifdef __cplusplus
}
#endif