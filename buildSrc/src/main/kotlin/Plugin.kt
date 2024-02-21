import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

fun PluginDependenciesSpec.citytexi(pluginName: String): PluginDependencySpec =  id("com.citytexi.fakegps.$pluginName")