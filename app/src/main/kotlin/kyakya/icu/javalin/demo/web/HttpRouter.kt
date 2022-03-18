package kyakya.icu.javalin.demo.web

import io.javalin.Javalin
import org.koin.core.component.KoinComponent

class HttpRouter(
    // member fields
    private val versionController: VersionController
) : KoinComponent {

    fun register(app: Javalin) {
        app.get("/version") { ctx -> ctx.json(versionController.get()) }
    }

}