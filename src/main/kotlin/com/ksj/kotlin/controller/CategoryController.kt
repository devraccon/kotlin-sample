package com.ksj.kotlin.controller

import com.ksj.kotlin.dto.CategoryResponse
import com.ksj.kotlin.dto.CategorySaveRequest
import com.ksj.kotlin.dto.ItemResponse
import com.ksj.kotlin.dto.ItemSaveRequest
import com.ksj.kotlin.entity.Category
import com.ksj.kotlin.service.CategoryService
import org.apache.tomcat.util.http.fileupload.MultipartStream.ItemInputStream
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CategoryController @Autowired constructor(val categoryService: CategoryService) {
    @GetMapping("/category")
    fun findCategories() : List<Category>{
        return categoryService.findCategory()
    }

    @PostMapping("/saveCategory")
    fun saveCategory(@RequestBody saveRequest: CategorySaveRequest) : CategoryResponse{
        return categoryService.saveCategory(saveRequest)
    }

    @PostMapping("/saveItem")
    fun saveItem(@RequestBody saveRequest: ItemSaveRequest) : ItemResponse {
        return categoryService.saveItem(saveRequest)
    }
}