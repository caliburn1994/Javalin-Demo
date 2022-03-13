package kyakya.icu.javalin.demo.config

import kyakya.icu.javalin.demo.web.HeathCheckController
import kyakya.icu.javalin.demo.web.HttpRouter
import org.koin.core.module.Module
import org.koin.dsl.module
import kotlin.reflect.full.declaredMemberProperties

@Suppress("RedundantVisibilityModifier")
object Modules {

    public val configModule = module {
        single {
            HttpRouter(get())
        }
    }
    public val healthCheck = module {
        single {
            HeathCheckController()
        }
    }


    fun getAllModules(): MutableList<Module> {
        val toList = Modules::class.declaredMemberProperties.stream()
            .filter { "${it.returnType}" == "org.koin.core.module.Module" }
            .map {
                @Suppress("UNCHECKED_CAST")
                it.get(this) as Module
            }.toList()
        return toList

    }
}
