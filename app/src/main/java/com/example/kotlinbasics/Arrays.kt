package com.example.kotlinbasics

class Fruits(var FruitName: String, var price: Double)

fun main(){
    // var array1: IntArray = intArrayOf(1,2,3,4,5)
    // var array1 = intArrayOf(1,2,3,4,5)
    var array1 = arrayOf(1,2,3,4,5)
    println(array1)   //It gives the address of the first element of array1
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
    array1[1] = 12
//    array1[7] = 13    -----> gives error of ArrayIndexOutOfBoundsException
    println("")
    var mutableArray = arrayOf(1, "John", 32, 53.0, "Doe", Fruits("Apple", 30.0))
    println(mutableArray.contentToString())
    var fruits = arrayOf(Fruits("Apple", 30.0), Fruits("Mango", 70.0))
    for(fruit in fruits){
        print("${fruit.FruitName} ")
    }
    println("")
    for(index in fruits.indices){                       // .indices ----> to obtain a valid range of indices in a list or array.
        println("${fruits[index].FruitName} is on index $index")
    }
}