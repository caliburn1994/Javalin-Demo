package kyakya.icu.javalin.demo.web

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory

class VersionController {

    private val gitInfo by lazy {
        val config = this::class.java.getResource("/git-info.yml")?.readText()
        ObjectMapper(YAMLFactory()).readValue(config, Map::class.java)
    }

    fun get(): Any {
        return gitInfo
    }
}