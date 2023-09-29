package com.example.kotlinbasics
/*
class OuterClass(){
    private var Name: String = "John"
    class NestedClass(){
        var description: String = "code is in nested class."
        private var ID: Int = 101
        fun foo(){
            //println("Name is $Name") -----> cannot access outer class member from nested class
            println("ID is $ID")
        }
    }
}
fun main(){
    println(OuterClass.NestedClass().description)
    var obj = OuterClass.NestedClass()
    obj.foo()
}
 */
class OuterClass(){
    private var Name: String = "John"
    inner class InnerClass{       // innerclass should not have a constructor
        var description: String = "code is in inner class."
        private var ID: Int = 101
        fun foo(){
            println("Name is $Name") //-----> can access outer class private member
            println("ID is $ID")
        }
    }
}
fun main(){
    println(OuterClass().InnerClass().description)
    var obj = OuterClass().InnerClass()
    obj.foo()
}