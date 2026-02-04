import com.example.BuildLogicClass
import com.example.shared.SharedClass
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import kotlin.apply

private class AndroidApplicationConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "com.android.application")
            apply(plugin = "org.jetbrains.kotlin.android")
            println("Plugin: ${BuildLogicClass().testBuild()}")
            println("Plugin direct: ${SharedClass.INTEGER}")
        }
    }
}
