import com.jaewon.gitraphql.Dependencies

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.apollographql.apollo3") version "3.7.5"
}

android {
    namespace = "com.jaewon.gitraphql"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.jaewon.gitraphql"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    apollo {
        packageName.set("com.jaewon.gitraphql")
    }
}

dependencies {

    implementation(Dependencies.AndroidX.coreKtx)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.Google.material)
    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.Test.androidXunit)
    androidTestImplementation(Dependencies.Test.espresso)

    implementation(Dependencies.AndroidX.Compose.composeUi)
    implementation(Dependencies.AndroidX.Compose.composeActivity)
    implementation(Dependencies.AndroidX.Compose.composeMaterial)
    implementation(Dependencies.AndroidX.Compose.composePreview)

    implementation(Dependencies.Di.koin)
    implementation(Dependencies.Di.koinAndroid)
    implementation(Dependencies.Di.koinViewModel)

    implementation(Dependencies.Mvi.orbit)
    implementation(Dependencies.Mvi.orbitCompose)
    implementation(Dependencies.Mvi.orbitViewModel)

    implementation(Dependencies.Apollo.apollo)
}