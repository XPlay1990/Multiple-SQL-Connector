package com.sql.sqlconnector.db2

import com.sql.sqlconnector.db2.data.UserRepository
import com.sql.sqlconnector.db2.data.entities.User
import org.apache.logging.log4j.LogManager
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun getEngineList(): MutableList<User> {
        logger.debug("Returning Engine List")
        return userRepository.findAll()
    }

    companion object { //static
        private val logger = LogManager.getLogger(this::class.java)
    }
}