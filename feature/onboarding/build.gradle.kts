plugins {
    citytexi("library")
    citytexi("compose")
}

android {
    namespace = "com.citytexi.fakegps.feature.onboarding"
}

dependencies {
    implementation(project(":core:design"))
}