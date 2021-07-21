package com.example.springBoot25.service

import com.example.springBoot25.ADO.AccountRepo
import com.example.springBoot25.model.Account
import org.springframework.stereotype.Service


@Service
class AccountService(val accountRepo: AccountRepo) {

    fun listAccount(): MutableList<Account> {
        return accountRepo.findAll()
    }

    fun getAccount(id:Long): Account {
        return accountRepo.getById(id)
    }

    fun updateAccount(account: Account){
        accountRepo.save(account)
    }

    fun deleteAccount(id: Long){
        accountRepo.deleteById(id)
    }
}