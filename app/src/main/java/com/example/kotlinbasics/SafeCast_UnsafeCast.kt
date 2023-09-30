package com.example.kotlinbasics

fun main(){
    //Unsafe Cast Operator ---> ClassCastException
    var obj: Any ?= 123
    var str: String = obj as String
    println(str)
    /*
    // Safe Cast Operator --> as?
    var obj: Any ?= 90
    var str: String ?= obj as? String
    print(str)
     */
}