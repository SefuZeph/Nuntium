plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "io.sefu.nuntium"
    compileSdk = 33

    defaultConfig {
        applicationId = "io.sefu.nuntium"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles (getDefaultProguardFile ("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion . VERSION_1_8
        targetCompatibility = JavaVersion . VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
    implementation("androidx.activity:activity-compose:1.6.1")
    implementation("androidx.compose.ui:ui:1.3.3")
    implementation("androidx.compose.ui:ui-tooling-preview:1.3.3")
    implementation("androidx.compose.foundation:foundation:1.3.1")
    implementation("androidx.compose.material:material:1.3.1")
    implementation("androidx.compose.material3:material3:1.0.1")
    implementation ("com.google.accompanist:accompanist-pager:0.29.1-alpha")
    implementation ("androidx.compose.ui:ui-util:1.3.3")
    implementation("androidx.core:core-ktx:+")
    val emoji2_version = "1.2.0"

    implementation("androidx.emoji2:emoji2:$emoji2_version")
    implementation("androidx.emoji2:emoji2-views:$emoji2_version")
    implementation("androidx.emoji2:emoji2-views-helper:$emoji2_version")

    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
    implementation ("app.rive:rive-android:4.0.0")
    implementation ("androidx.startup:startup-runtime:1.1.0")
    implementation ("com.google.accompanist:accompanist-systemuicontroller:0.17.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.3.3")
    debugImplementation("androidx.compose.ui:ui-tooling:1.3.3")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.3.3")
}