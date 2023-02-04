package com.ksj.kotlin.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name="category")
class Category(
    @Column(name="category_name")
    var categoryName:String,
    @Column(name="created_date")
    var cratedDate : LocalDateTime = LocalDateTime.now(),
    @Column(name="updated_date")
    var updatedDate : LocalDateTime = LocalDateTime.now(),
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_seq")
    var items : List<Item> = ArrayList()
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="seq")
    var seq : Long?= null
}