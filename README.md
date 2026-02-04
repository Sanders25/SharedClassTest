Project contains `:app`, `:convention:plugins` and `:shared` modules. `:shared` is a separate build, that gets included with `includeBuild` into root project and conventions project. 
`:shared` contains class `SharedClass` with single constant. This constant is printed to logcat during build inside `AndroidApplicationConventionPlugin.kt` and inside `MainActivity`. 
When the root `gradle.properties` file contains setting `org.gradle.configuration-cache=true` - build fails with error `project  :shared not found`. If we try to set it to false - build will complete successfully.
