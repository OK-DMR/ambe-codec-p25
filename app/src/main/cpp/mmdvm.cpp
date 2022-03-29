#include "mmdvm.h"

extern "C"
JNIEXPORT jint JNI_OnLoad(JavaVM* vm, void* reserved) {
    return JNI_VERSION_1_6;
}

extern "C"
JNIEXPORT jstring JNICALL
Java_cz_okdmr_mmdvm_MainActivity_getNativeString(JNIEnv *env, jobject thiz) {
    BeOn::AmbeVocoder *voice = new BeOn::AmbeVocoder(0);
    voice->decodeInit();
    return env->NewStringUTF("Ahoj 2");
}