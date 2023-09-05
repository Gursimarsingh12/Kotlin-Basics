package com.example.kotlinbasics


fun main(){
//    if we want to print null then we directly print
    var name: String ?= "a"
    name = null
//    println("${name?.length}")
//    if we don't want to print anything we use let
    var name1: String ?= "Meet"
//    name1 = null
//    name1?.let { print(it.length) }
    // Elvis Operator = ?: and it will print guest if name is null else print "a"
    var name2 = name?: "Guest"
    println("$name2")
}