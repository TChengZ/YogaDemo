#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_yoga_jc_yogademo_YogaActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */, jstring s) {
    std::string hello = "I am text ";
    std::string str = env->GetStringUTFChars(s, JNI_FALSE);
    std::string result = hello + str;
    return env->NewStringUTF(result.c_str());
}

