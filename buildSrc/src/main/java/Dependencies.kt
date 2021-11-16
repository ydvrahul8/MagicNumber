import org.gradle.api.artifacts.dsl.DependencyHandler

/**
 * To define plugins
 */
object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
}

/**
 * To define dependencies
 */
object Dependencies {

    val build_gradle = "com.android.tools.build:gradle:${Versions.build_gradle}"
    val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val ktlint = "org.jlleitschuh.gradle:ktlint-gradle:${Versions.ktlint}"
    val ben_mane_gralde = "com.github.ben-manes:gradle-versions-plugin:${Versions.ben_mane_gralde}"

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    val TIMBER by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }
    val KOTLIN by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }

    const val ANDROIDX_FRAGMENT = "androidx.fragment:fragment-ktx:${Versions.androidx_fragment}"
    const val ANDROIDX_LEANBACK = "androidx.leanback:leanback:${Versions.leanback}"
    const val ANDROID_CORE_KTX = "androidx.core:core-ktx:${Versions.androidXCore}"
    const val ANDROID_APP_COMPAT = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val ANDROID_MATERIAL_DESIGN = "com.google.android.material:material:${Versions.material}"
    const val ANDROID_CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    val JUNIT by lazy { "junit:junit:${Versions.jUnit}" }
    val JUNIT_ANDROID by lazy { "androidx.test.ext:${Versions.junitAndroid}" }
    val ESPRESSO by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }
    val LEANBACK by lazy { "androidx.leanback:leanback:${Versions.leanback}" }

    const val HILT = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val HILT_VIEWMODEL = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hilt_viewModel}"
    const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val HILT_ANDROID_COMPILER = "androidx.hilt:hilt-compiler:${Versions.hilt_android_compiler}"

    const val EXOPLAYER = "com.google.android.exoplayer:exoplayer:${Versions.exoplayer}"
    const val EXOPLAYER_CORE = "com.google.android.exoplayer:exoplayer-core:${Versions.exoplayer}"
    const val EXOPLAYER_DASH = "com.google.android.exoplayer:exoplayer-dash:${Versions.exoplayer}"
    const val EXOPLAYER_UI = "com.google.android.exoplayer:exoplayer-ui:${Versions.exoplayer}"
    const val EXOPLAYER_HLS = "com.google.android.exoplayer:exoplayer-hls:${Versions.exoplayer}"
    const val EXOPLAYER_LEANBACK = "com.google.android.exoplayer:extension-leanback:${Versions.exoplayer}"

    const val INTUIT_SSP = "com.intuit.ssp:ssp-android:${Versions.intuit_dp}"
    const val INTUIT_SDP = "com.intuit.sdp:sdp-android:${Versions.intuit_dp}"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val RETROFIT_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.interceptor}"

    const val MOSHI = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val MOSHI_KAPT = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"

    const val LIFECYCLE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val LIFECYCLE_COMMON = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
    const val LIFECYCLE = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"

    const val COROUTINES_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    const val GLIDE = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${Versions.glide}"

    const val OTP_VIEW = "com.github.mukeshsolanki:android-otpview-pinview:${Versions.otp_view}"

    const val AUHT0 = "com.auth0.android:auth0:${Versions.auth0}"

    const val COUNTRY_PICKER = "com.hbb20:ccp:${Versions.country_picker}"

}

object Project {
    val ONBOARDING by lazy { ":pm_feature_onboarding" }
}

fun DependencyHandler.appCompat() {
    implementation(Dependencies.ANDROID_APP_COMPAT)
    implementation(Dependencies.ANDROID_CORE_KTX)
}

fun DependencyHandler.test() {
    implementation(Dependencies.JUNIT)
    implementation(Dependencies.ESPRESSO)
}

fun DependencyHandler.materialDesign() {
    implementation(Dependencies.ANDROID_MATERIAL_DESIGN)
}

fun DependencyHandler.leanback() {
    implementation(Dependencies.LEANBACK)
}

fun DependencyHandler.constraintLayout() {
    implementation(Dependencies.ANDROID_CONSTRAINT_LAYOUT)
}

fun DependencyHandler.androidxFragment() {
    implementation(Dependencies.ANDROIDX_FRAGMENT)
}

fun DependencyHandler.hilt() {
    implementation(Dependencies.HILT)
    kapt(Dependencies.HILT_COMPILER)
}

fun DependencyHandler.kotlin() {
    implementation(Dependencies.KOTLIN)
}
/*
fun DependencyHandler.lifecycle() {
    implementation(Dependencies.ANDROID_LIFECYCLE_RUNTIME)
    implementation(Dependencies.ANDROID_LIFECYCLE_EX)
    implementation(Dependencies.ANDROID_LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.ANDROID_LIFECYCLE_LIVEDATA)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_CONVERTER_MOSHI)
    implementation(Dependencies.OKHTTP_LOGGER)
}

fun DependencyHandler.moshi() {
    implementation(Dependencies.MOSHI)
    kapt(Dependencies.MOSHI_CODEGEN)
}

fun DependencyHandler.room() {
    api(Dependencies.ANDROID_ROOM_RUNTIME)
    implementation(Dependencies.ANDROID_ROOM_KTX)
    kapt(Dependencies.ANDROID_ROOM_COMPILER)
}*/

fun DependencyHandler.implementation(depName: String) {
    add("implementation", depName)
}

private fun DependencyHandler.kapt(depName: String) {
    add("kapt", depName)
}

private fun DependencyHandler.compileOnly(depName: String) {
    add("compileOnly", depName)
}

private fun DependencyHandler.api(depName: String) {
    add("api", depName)
}