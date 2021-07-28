package com.example.springBoot25

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class SeedData(private val initialization: Initialization) : CommandLineRunner {
    override fun run(vararg args: String?) {
        initialization.up()
    }
}