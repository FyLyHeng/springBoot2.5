package com.example.springBoot25.model

import javax.persistence.*

@Entity
data class Item (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long,
    var name:String,
    var price:Double,

    @ManyToOne
    @JoinColumn(name="account_id")
    var account: Account
)