package com.example.springBoot25.controller

import com.example.springBoot25.service.AccountService
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class AccountController(val accountService: AccountService) {

    @GetMapping("/home")
    fun listTest(): ModelAndView {
        return ModelAndView("account")
    }

    @RequestMapping("/")
    fun index(map: ModelMap): String {
        map.addAttribute("items", accountService.listAccount())
        map.addAttribute("header", "My Headerling")
        return "account"
    }
}