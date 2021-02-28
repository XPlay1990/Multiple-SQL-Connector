package com.sql.sqlconnector.db1

import com.sql.sqlconnector.db1.data.EngineRepository
import com.sql.sqlconnector.db1.data.entities.Engine
import org.apache.logging.log4j.LogManager
import org.springframework.stereotype.Service

@Service
class EngineService(private val engineRepository: EngineRepository) {

    fun getEngineList(): MutableList<Engine> {
        logger.debug("Returning Engine List")
        return engineRepository.findAll()
    }

    companion object { //static
        private val logger = LogManager.getLogger(this::class.java)
    }
}