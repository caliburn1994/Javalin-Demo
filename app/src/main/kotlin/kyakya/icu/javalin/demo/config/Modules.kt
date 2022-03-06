package kyakya.icu.javalin.demo.config

import kyakya.icu.javalin.demo.web.HttpRouter
import org.koin.dsl.module

object Modules {

    private val configModule = module {
        single {
            HttpRouter()
        }
    }

    internal val allModules = listOf(configModule)
}
