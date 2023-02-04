package com.ksj.kotlin.repository

import com.ksj.kotlin.entity.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRespository : JpaRepository<Category, Long > {
}