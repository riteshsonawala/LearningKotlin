package com.twilight.LearningKotlin.util

class References {
    var name = "Ritesh"

    constructor(name: String){
        this.name = name
    }

    fun printName(){
        println(name)
    }


}

fun main(){
    var methodref = References::printName
    var constref = ::References
    var propref = References::name

    println(propref.get(References("Trupti")))
    methodref.invoke(References("TruptiG"))
    val instance = constref("Trups")
    instance.printName()

}