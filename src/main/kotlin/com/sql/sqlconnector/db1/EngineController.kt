package com.sql.sqlconnector.db1

import com.sql.sqlconnector.db1.data.entities.Engine
import org.apache.logging.log4j.LogManager
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/engineList")
class EngineController(private val engineService: EngineService) {

    @GetMapping
    fun getEngines(): MutableList<Engine> {
        return engineService.getEngineList()
    }

    companion object {
        private val logger = LogManager.getLogger(this::class.java)
    }
}