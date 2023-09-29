package com.example.kotlinbasics

class TestClass(){
    fun testing(){
        var test = SuperClass()
        println(test.a)
//        println(test.b)  --> b is private and it is only visible in containing class
//        println(test.c)  --> c is protected and visible to only subclasses or containing class
        println(test.d)
    }
}
// Those who are commented are errors
open class SuperClass{
    var a = 1
    private var b = 2
    protected var c = 3
    internal var d = 4
}
class SubClass: SuperClass() {
    fun test(){
        println(a)
//        println(b)
        println(c)
        println(d)
    }
}
fun main(){
    var testperson = SuperClass()
    testperson.a
//    testperson.b
//    testperson.c
    testperson.d
}