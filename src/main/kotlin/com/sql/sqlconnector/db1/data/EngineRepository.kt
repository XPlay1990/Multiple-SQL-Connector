package com.sql.sqlconnector.db1.data

import com.sql.sqlconnector.db1.data.entities.Engine
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EngineRepository : JpaRepository<Engine, Long>