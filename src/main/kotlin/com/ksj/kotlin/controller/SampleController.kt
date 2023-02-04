package com.ksj.kotlin.controller

import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RequiredArgsConstructor
@RestController
class SampleController {

    @GetMapping("/sample/getData" , "/sample/getData1")
    fun sampleGet(paramName: Optional<String>): String {
        return "Sample return ${paramName.orElse("값이 없음")}"
    }
}