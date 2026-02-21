package com.twilight.LearningKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class LearningKotlinApplication

@RestController
class HelloController {
	@GetMapping("/hello")
	fun hello(): String {
		return "Hello, Kotlin!"
	}
}

fun main(args: Array<String>) {
	runApplication<LearningKotlinApplication>(*args)
}
