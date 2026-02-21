package com.twilight.LearningKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.core.io.ClassPathResource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.io.BufferedReader

@SpringBootApplication
class LearningKotlinApplication

data class Product(
	val productName: String,
	val quantity: Int,
	val price: Double,
	val desc: String
)

@RestController
class HelloController {
	@GetMapping("/hello")
	fun hello(): String {
		return "Hello, Kotlin!"
	}

	@GetMapping("/products")
	fun getProducts(): List<Product> {
		val resource = ClassPathResource("products.csv")
		val reader: BufferedReader = resource.inputStream.bufferedReader()

		// Read all lines
		val lines = reader.readLines()

		// Skip header and parse each line
		return lines.drop(1).map { line ->
			val parts = line.split(",")
			Product(
				productName = parts[0],
				quantity = parts[1].toInt(),
				price = parts[2].toDouble(),
				desc = parts[3]
			)
		}
	}
}

fun main(args: Array<String>) {
	runApplication<LearningKotlinApplication>(*args)
}
