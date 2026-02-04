import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
    implementation("com.example:shared:1.0.0")
}

gradlePlugin {
    plugins {
        // conventions
        register("AndroidApplication") {
            id = libs.plugins.convention.android.application.get().pluginId
            implementationClass = "AndroidApplicationConventionPlugin"
        }
    }
}