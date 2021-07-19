package com.example.springBoot25.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/account")
class AccountController {

    @GetMapping
    fun listTest(): String {
        return "this is my test spring boot with meaven project"
    }
}