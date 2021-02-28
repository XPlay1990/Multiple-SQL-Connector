package com.sql.sqlconnector.db2

import com.sql.sqlconnector.db2.data.entities.User
import org.apache.logging.log4j.LogManager
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/userList")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getEngines(): MutableList<User> {
        return userService.getEngineList()
    }

    companion object {
        private val logger = LogManager.getLogger(this::class.java)
    }
}