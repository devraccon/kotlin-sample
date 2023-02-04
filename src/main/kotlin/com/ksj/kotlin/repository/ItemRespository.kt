package com.ksj.kotlin.repository

import com.ksj.kotlin.entity.Item
import org.springframework.data.jpa.repository.JpaRepository

interface ItemRespository : JpaRepository<Item, Long> {
}