package com.jaewon.gitraphql

object Dependencies {

    object Google {
        const val material = "com.google.android.material:material:1.5.0"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.7.0"
        const val appCompat = "androidx.appcompat:appcompat:1.4.1"

        object Compose {
            private const val version = "1.3.1"

            const val composeUi = "androidx.compose.ui:ui:$version"
            const val composeMaterial = "androidx.compose.material:material:$version"
            const val composePreview = "androidx.compose.ui:ui-tooling-preview:$version"
            const val composeActivity = "androidx.activity:activity-compose:1.6.1"
        }
    }

    object Test {
        const val junit = "junit:junit:4.13.2"
        const val androidXunit = "androidx.test.ext:junit:1.1.3"
        const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
    }
}