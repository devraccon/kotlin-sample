package com.ksj.kotlin.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "item")
class Item(
    @Column(name = "item_name")
    var itemName: String = "",
    @Column(name = "category_seq")
    var category: Long? = null,
    @Column(name = "created_date")
    var cratedDate: LocalDateTime = LocalDateTime.now(),
    @Column(name = "updated_date")
    var updatedDate: LocalDateTime = LocalDateTime.now(),
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq")
    var seq: Long?=null
}