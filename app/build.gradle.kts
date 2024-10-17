plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.mykosx.android.experiments"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mykosx.android.experiments"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}
dependencies {
    implementation(project(":activity-basic"))
    implementation(project(":activity-detail"))
    implementation(project(":activity-empty"))
    implementation(project(":activity-fragment"))
    implementation(project(":activity-fullscreen"))
    implementation(project(":activity-login"))
    implementation(project(":activity-navigation-bottom"))
    implementation(project(":activity-navigation-drawer"))
    implementation(project(":activity-response"))
    implementation(project(":activity-scrolling"))
    implementation(project(":activity-settings"))
    implementation(project(":activity-tabbed"))
    implementation(project(":activity-tv"))
    implementation(libs.androidx.appcompat)
}

