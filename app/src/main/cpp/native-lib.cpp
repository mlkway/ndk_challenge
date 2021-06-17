#include <jni.h>
#include <string>


extern "C" JNIEXPORT jstring JNICALL
Java_com_raywenderlich_ndk_1challenge_app_App_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "AIzaSyBflaWJ5NRuVWza9L4o8dfA8fZezIbAFBg";
    return env->NewStringUTF(hello.c_str());
}