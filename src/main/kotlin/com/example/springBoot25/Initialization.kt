package com.example.springBoot25

import com.example.springBoot25.ADO.AccountRepo
import com.example.springBoot25.ADO.ItemRepo
import com.example.springBoot25.model.Account
import com.example.springBoot25.model.Item
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class Initialization {
    //bean inject
    @Autowired
    lateinit var accountRepo: AccountRepo
    @Autowired
    lateinit var itemRepo: ItemRepo



    //logic init default data
    private fun initAccount(){
        when {
            accountRepo.findById(1).isEmpty -> {
                accountRepo.save(Account(name = "lizaKoK",email = "liza.kok@gmail.com",sex = "M"))
            }
        }
    }

    private fun initItem(){
        when {
            itemRepo.findById(1).isEmpty -> {
                itemRepo.save(Item(id = 1,name = "lizaKoK",price = 1.3))
            }
        }
    }



    //main fun
    fun up(){
        //some log
        initAccount()

        //some log
        initItem()
    }
}