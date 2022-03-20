package com.example.springBoot25.model

import javax.persistence.*

@Entity
data class Account(
        @Id
        @SequenceGenerator(name = "account_seq", sequenceName = "account_seq",allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_seq")
        var id:Long?=0,

        var name :String?="",

        @Column(nullable = true)
        val email :String?="",

        val sex:String?="M",

        @OneToMany(mappedBy = "account")
        var items: List<Item>?=null
)
