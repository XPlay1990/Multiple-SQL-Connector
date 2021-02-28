package com.sql.sqlconnector.db2.data.entities

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "user")
data class User (
    @Column(name = "username")
    var userName: String,

    @Column(name = "email")
    var email: String
){
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0
}