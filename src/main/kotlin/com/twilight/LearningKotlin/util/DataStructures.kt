package com.twilight.LearningKotlin.util

class DataStructures {
    val list = listOf(1,2,3)
    val mutableList = mutableListOf(1,2,3)
    val mutableSet = mutableSetOf(1,2,3,1)
    val map = mapOf("one" to 1, "two" to 2)
}

fun main() {
    var constructorRef = ::DataStructures
    println(constructorRef().list::class)
    val list = constructorRef().mutableList
    val set = constructorRef().mutableSet
    val map = constructorRef().map
    list.add(4)

    for (item in list) print(item)
    for (item in set) print(item)
    for ((key, value) in map) println("$key -> $value")
}