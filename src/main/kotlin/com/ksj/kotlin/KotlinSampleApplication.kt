package com.ksj.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSampleApplication

fun main(args: Array<String>) {

    runApplication<KotlinSampleApplication>(*args)
}
