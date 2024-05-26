pluginManagement {
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
        jcenter()
        maven ("https://jitpack.io" )
        maven ("https://repo1.maven.org/maven2/")
    }
}

rootProject.name = "ef-testwork"
include(":app")
include(":data")
include(":domain")
