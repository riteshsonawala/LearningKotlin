package com.twilight.LearningKotlin.util

fun main() {
    val str: String = "Hello, World"
    val split = str.split(",")
    println(split::class.simpleName)

}