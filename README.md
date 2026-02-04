Project contains `:app`, `:convention:plugins` and `:shared` modules. `:shared` is a separate build, that gets included with `includeBuild` into root project and conventions project. 
`:shared` contains class `SharedClass` with single constant. This constant is printed to logcat during build inside `AndroidApplicationConventionPlugin.kt` and in application runtime inside `MainActivity`. 
When the root `gradle.properties` file contains setting `org.gradle.configuration-cache=true` - build fails with error `project  :shared not found`. If we try to set it to false - build will complete successfully. Commenting out one of the `implementation`s makes error disappear.
Even with configuration cache turned on both logs get printed as usual, it is tasks `mergeDebugNativeLibs`, `mergeLibDexDebug` and `compileDebugKotlin`  that fail.

Project uses `Android Gradle Plugin: 8.13.2`, `Kotlin: 2.3.0`, `Gradle: 9.2.1`.
