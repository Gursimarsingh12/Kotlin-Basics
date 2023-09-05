package com.example.kotlinbasics

class Box{
    var length = 5
    var height = 4
    var width = 10
    fun open(){
        println("Box is Opened")
    }
    fun fillContents(){
        println("Box is Filled")
    }
    fun color(){
        println("Box is colored")
    }
    fun close(){
        println("Box is closed")
    }
}
fun main(){
    val box1: Box = Box()
    val box2: Box = Box()
    println("Length of Box 1 is: ${box1.length}")
    box1.open()
    box1.fillContents()
    box1.color()
box1.close()
}