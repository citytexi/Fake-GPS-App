pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "fakegps"
include(":app")

include(
    ":core:analytics",
    ":core:data",
    ":core:design",
    ":core:domain",
    ":core:model",
)

include(
    ":feature:onboarding",
)