package com.example.kotlinbasics
/*
fun addNumbers(a: Int, b: Int): Int {
    return (a + b)
}
fun main(){
    println(addNumbers(10,20))
}
 */

// Lambda Expressions: Function which has no name and more advanced than simple functions
// var sum = {a: Int, b: Int -> println(a + b)}
var sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b}
fun main(){
    println(sum(3,4))
}