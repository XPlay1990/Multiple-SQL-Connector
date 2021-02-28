package com.sql.sqlconnector

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SqlConnectorApplication

fun main(args: Array<String>) {
	runApplication<SqlConnectorApplication>(*args)
}
