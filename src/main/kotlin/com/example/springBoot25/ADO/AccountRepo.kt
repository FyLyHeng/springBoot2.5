package com.example.springBoot25.ADO

import com.example.springBoot25.model.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepo : JpaRepository<Account,Long> {
}