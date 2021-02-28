package com.sql.sqlconnector.db1.data.entities

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "engine")
data class Engine (
    @Column(name = "Engine_Name")
    var engineName: String
){
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0
}