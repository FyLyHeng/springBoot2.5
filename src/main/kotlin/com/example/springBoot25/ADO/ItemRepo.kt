package com.example.springBoot25.ADO

import com.example.springBoot25.model.Item
import org.springframework.data.jpa.repository.JpaRepository

interface ItemRepo : JpaRepository<Item,Long> {
}