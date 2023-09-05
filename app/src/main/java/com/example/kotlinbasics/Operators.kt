package com.example.kotlinbasics

fun main(){

    var a = 10; var b = 4
// arithmetic operators
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")
    // assignment operators
    a += b
    println("a += b = $a")
    // bitwise
    println("Bitwise XOR of 10 and 4 = ${36.xor(22)}")
    println("Inverse of $a = ${a.inv()}")
    // Comparison operators
    var ifEasy = a != b
    println("$ifEasy")
    var c = b..a
    println("$c")
    // Unary Operators
    println("a++ = ${a++}")
    println("++a = ${++a}")
    println("a-- = ${--b}")
    println("--a = ${b--}")
    // Logical Operators ----> &&, ||, !
}