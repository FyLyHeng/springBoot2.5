package com.example.springBoot25.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Item (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long,
    var name:String,
    var price:Double
)