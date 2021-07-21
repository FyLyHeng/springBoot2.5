package com.example.springBoot25.controller

import com.example.springBoot25.model.Account
import com.example.springBoot25.service.AccountService
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/account")
class AccountController(val accountService: AccountService) {

    @RequestMapping("/")
    fun index(map: ModelMap): String {
        map.addAttribute("accounts", accountService.listAccount())
        map.addAttribute("heading", "List All Account")
        return "account"
    }

    @RequestMapping("/edit/{id}")
    fun edit(@PathVariable id: Long, map: ModelMap): String {
        val account = accountService.getAccount(id)
        map.addAttribute("account", account)
        map.addAttribute("heading", "Edit Account")
        return "editAccount"
    }

    @RequestMapping("/update")
    fun edit(map: ModelMap, account: Account): String {
        accountService.updateAccount(account)
        val accounts = accountService.listAccount()

        map.addAttribute("accounts", accounts)
        map.addAttribute("heading", "List All Account")
        return "redirect:/account/"
    }

    @RequestMapping("/add")
    fun save(map: ModelMap): String {
        var newAccount = Account()
        map.addAttribute("account",newAccount)
        map.addAttribute("heading", "Create new Account")
        return "editAccount"
    }

    @RequestMapping("/delete/{id}")
    fun delete(@PathVariable id:Long,map: ModelMap):String{
        accountService.deleteAccount(id)
        map.addAttribute("accounts",accountService.listAccount())
        map.addAttribute("heading","List All Account")
        return "redirect:/account/"
    }
}