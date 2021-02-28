package com.sql.sqlconnector.db2.data

import com.sql.sqlconnector.db2.data.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>