package kyakya.icu.javalin.demo.web

import io.javalin.Javalin
import org.koin.core.component.KoinComponent

class HttpRouter(
    // member fields
    private val heathCheckController: HeathCheckController
) : KoinComponent {

    fun register(app: Javalin) {
        app.get("/heath") { ctx -> ctx.json(heathCheckController.get()) }
    }

}