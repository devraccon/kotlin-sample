package com.ksj.kotlin.dto

import com.fasterxml.jackson.annotation.JsonFormat
import com.ksj.kotlin.entity.Category
import com.ksj.kotlin.entity.Item
import java.time.LocalDateTime

data class ItemResponse(
    var seq : Long?=null,
    var itemName : String,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Seoul")
    var createDate : LocalDateTime,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Seoul")
    var updatedDate : LocalDateTime,
    var category : Category?=null
)
