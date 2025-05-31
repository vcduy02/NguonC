plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    buildFeatures {
        buildConfig = true
        viewBinding = true
    }
}

dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}

version = 1

cloudstream {
    description = "Plugin phim.nguonc.com - Xem phim mới cập nhật, danh mục, tập phim"
    authors = listOf("vcduy02")

    status = 1

    tvTypes = listOf("Movie", "TV")

    requiresResources = true

    language = "vi"

    iconUrl = "https://phim.nguonc.com/public/images/Logo/logonc.png"
}
