package com.example.kotlinbasics

fun main(){
    // Sets is a type of collection which only recognises unique values and ignore duplicate values
    var vegetable = setOf<String>("Potato", "Tomato", "Onion", "Onion", "Tomato", "LadyFinger")
    println(vegetable)
    println(vegetable.size)
    var mutableVegetable = vegetable.toMutableSet()
    mutableVegetable.add("Capsicum")
    println(mutableVegetable)
    println("Sorted set of mutable Vegetable is: ${mutableVegetable.toSortedSet()}")
    println("Sorted element at index 0: ${mutableVegetable.elementAt(0)}")

    // Maps is a type of collection which has key-value pairs like dictionaries in python
    var months = mapOf(1 to "January", 2 to "Feb", 3 to "March")
    for(key in months.keys){
        println("$key is to: ${months[key]}")
    }
    println("Sorted Maps of months: ${months.toSortedMap()}")
    var foodMap = mapOf("Favourite" to Food("Dosa",90.0), "OK" to Food("Chhole Bhature", 40.0))
    for(food in foodMap.keys){
        println("$food: ${foodMap[food]}")
    }
    println("${months.getValue(1)}")
}
data class Food(var Name: String, var Price: Double)