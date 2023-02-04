package com.ksj.kotlin.service

import com.ksj.kotlin.dto.CategoryResponse
import com.ksj.kotlin.dto.CategorySaveRequest
import com.ksj.kotlin.dto.ItemResponse
import com.ksj.kotlin.dto.ItemSaveRequest
import com.ksj.kotlin.entity.Category
import com.ksj.kotlin.entity.Item
import com.ksj.kotlin.repository.CategoryRespository
import com.ksj.kotlin.repository.ItemRespository
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryService @Autowired constructor(
    val categoryRespository : CategoryRespository,
    var itemRepository: ItemRespository
    ){

    fun findCategory() : List<Category> {
        return categoryRespository.findAll()
    }

    fun saveCategory(saveRequest:CategorySaveRequest) : CategoryResponse {
        var category:Category = Category(categoryName = saveRequest.categoryName)
        categoryRespository.save(category)
        return CategoryResponse(seq = category.seq,
            categoryName = category.categoryName,
            createDate = category.cratedDate,
            updatedDate = category.updatedDate
            )
    }
    fun saveItem(saveRequest: ItemSaveRequest) : ItemResponse {

        var item:Item = Item(itemName = saveRequest.itemName , category = saveRequest.categorySeq)
        itemRepository.save(item)

        var category:Category = categoryRespository.findById(saveRequest.categorySeq).orElse(null)
        return ItemResponse(seq = item.seq,
            itemName = item.itemName,
            createDate = item.cratedDate,
            updatedDate = item.updatedDate,
            category = category
        )
    }


}