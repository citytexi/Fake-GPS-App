plugins {
    citytexi("library")
    citytexi("compose")
}

android {
    namespace = "com.citytexi.fakegps.core.analytics"
}

dependencies {
    implementation(libs.compose.runtime)
}
