package com.example.kotlinbasics

import java.lang.Math.floor

fun main(){
    var simpleList: List<Int> = listOf(10,20,30,40)
    var mixedList: List<Any> = listOf("John", 20, 40.54, true)
    for(value in mixedList){
        when(value){
            is Int -> println("$value is integer.")
            is Double -> println("$value is double and its floor value is ${kotlin.math.floor(value)}.")
            is String -> println("$value is string and its length is ${value.length}.")
            else -> println("Unknown Type")
        }
    }

// Smart Cast
    var hello: Any = "Hello World"
    if(hello !is String){
        println("null")
    }
    else{
        // object is automatically casted to a string in this scope
        println("$hello is a string and its length is ${hello.length}")
    }
    // Explicit(Unsafe Cast) using as keyword ->>>> Can go wrong
    var str1: String = hello as String
    println("${str1.length}")
    // unsafe
    //var int: Any = 12632 as String
    //println("$int")
    // Safe Cast
    var obj1: Any ?= 1234
    var check: String ?= obj1 as? String
    println("$check")

}