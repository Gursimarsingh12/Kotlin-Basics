package com.example.kotlinbasics

data class User(var name: String, var id: Int)
fun main(){
    val user1: User = User("Angel", 1)
    var user2: User = User("Pragati", 2)
//    val name = user1.name
//    println("$name")
    //user1.id = 2  // val cannot be reassigned
//    copy() ----> it helps to copy the arguments from one object to other
    user2 = user1.copy(name = "Angel")
    println("$user2")
    println("${user1 == user2}")   // Prints true
    println("${user1.equals(user2)}")   // Prints true
//    User components ---> It is like accessing each component/attribute from an object
    println("1st Component is: ${user1.component1()}")
    println("2nd Component is: ${user1.component2()}")
    var user3 = User("John", 3)
    val (name,id) = user3
    println("Name: $name and ID: $id")
}