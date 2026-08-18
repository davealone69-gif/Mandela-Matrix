plugins {
    id("AndroidLibraryConventionPlugin")
    alias(libs.plugins.detekt)
}

android {
    namespace = "com.mandela.matrix.reimagenator.libs"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}

detekt {
    config.setFrom("$rootDir/detekt.yml")
    buildUponDefaultConfig = true
}
