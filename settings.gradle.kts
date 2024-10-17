pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "Android Experiments"
include(":app")
include(":activity-tabbed")
include(":activity-settings")
include(":activity-scrolling")
include(":activity-response")
include(":activity-detail")
include(":activity-navigation-drawer")
include(":activity-login")
include(":activity-fullscreen")
include(":activity-fragment")
include(":activity-empty")
include(":activity-navigation-bottom")
include(":activity-basic")
include(":activity-tv")
