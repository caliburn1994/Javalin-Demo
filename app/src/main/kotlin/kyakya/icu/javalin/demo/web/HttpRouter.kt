package kyakya.icu.javalin.demo.web

import io.javalin.Javalin
import org.koin.core.component.KoinComponent

class HttpRouter : KoinComponent {
    fun register(app: Javalin) {
        app.get("/") { ctx -> ctx.result("Hello World") }
    }
}