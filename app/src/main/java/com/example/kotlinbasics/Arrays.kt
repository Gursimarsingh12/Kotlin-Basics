package com.example.kotlinbasics

class Fruits(var FruitName: String, var price: Double)
fun main(){
    // var array1: IntArray = intArrayOf(1,2,3,4,5)
    // var array1 = intArrayOf(1,2,3,4,5)
    var array1 = arrayOf(1,2,3,4,5)
//    println("\n${array1.contentToString()}")
    print("Initial values: ")
    for(element in array1){
        print("$element,")
    }
    println("")
    print("New value after adding 2: ")
    for(element in array1){
        print("${element+2},")
    }
    println("")
    print("Real elements of array1: ")
    for(element in array1){
        print("$element,")
    }

}