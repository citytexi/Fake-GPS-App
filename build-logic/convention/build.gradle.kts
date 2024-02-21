plugins {
    `kotlin-dsl`
}

group = "com.citytexi.fakegps.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


dependencies {
    compileOnly(libs.agp)
    compileOnly(libs.kotlin.gradleplugin)
    compileOnly(libs.ksp.gradlePlugin)
}

gradlePlugin {
    plugins {
        create("android-application") {
            id = "com.citytexi.fakegps.application"
            implementationClass = "com.citytexi.fakegps.plugin.AndroidApplicationPlugin"
        }
        create("android-library") {
            id = "com.citytexi.fakegps.library"
            implementationClass = "com.citytexi.fakegps.plugin.AndroidLibraryPlugin"
        }
        create("android-kotlin") {
            id = "com.citytexi.fakegps.kotlin"
            implementationClass = "com.citytexi.fakegps.plugin.AndroidKotlinPlugin"
        }
        create("android-hilt") {
            id = "com.citytexi.fakegps.hilt"
            implementationClass = "com.citytexi.fakegps.plugin.AndroidHiltPlugin"
        }
        create("android-room") {
            id = "com.citytexi.fakegps.room"
            implementationClass = "com.citytexi.fakegps.plugin.AndroidRoomConventionPlugin"
        }
        create("kotlin-serialization") {
            id = "com.citytexi.fakegps.serialization"
            implementationClass = "com.citytexi.fakegps.plugin.KotlinSerializationPlugin"
        }
        create("junit5") {
            id = "ccom.citytexi.fakegps.junit5"
            implementationClass = "com.citytexi.fakegps.plugin.JUnit5Plugin"
        }
        create("android-test") {
            id = "com.citytexi.fakegps.test"
            implementationClass = "com.citytexi.fakegps.plugin.AndroidTestPlugin"
        }
        create("compose") {
            id = "com.citytexi.fakegps.compose"
            implementationClass = "com.citytexi.fakegps.plugin.ComposePlugin"
        }
    }
}

