package kyakya.icu.javalin.demo.web

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory

class HeathCheckController {

    private var gitInfo: Any

    init {
        val config = this::class.java.getResource("/git-info.yml")?.readText()
        gitInfo = ObjectMapper(YAMLFactory())
            .readValue(config, Map::class.java)
    }

    fun get(): Any {
        return gitInfo
    }
}