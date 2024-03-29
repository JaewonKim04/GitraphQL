
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:7.1.3")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath ("com.google.gms:google-services:4.3.15")
        classpath ("com.apollographql.apollo:apollo-gradle-plugin:2.5.14")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}