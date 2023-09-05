package com.example.kotlinbasics

fun main(){
    var myName = "Meet"
    val Name = "Janu"
    print("Hello World")
    print(" Hello " + myName)
    myName = "Pagal"  //Var can be overwritten thus mutable
    print(" Hello " + myName)
//    Name = "Preet" ----> Val can not be reassigned, thus immutable
    print(" Hello " + Name)
}