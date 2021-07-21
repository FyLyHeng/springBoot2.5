package com.example.springBoot25.service

import com.example.springBoot25.ADO.AccountRepo
import com.example.springBoot25.model.Account
import org.springframework.stereotype.Service


@Service
class AccountService(val accountRepo: AccountRepo) {

    fun listAccount(): MutableList<Account> {
        return mutableListOf(
                Account(1,"heng","heng@gmail.com","M"),
                Account(2,"liza","liza@gmail.com","M"),
                Account(3,"kok","kok@gmail.com","M")
        )
    }
}