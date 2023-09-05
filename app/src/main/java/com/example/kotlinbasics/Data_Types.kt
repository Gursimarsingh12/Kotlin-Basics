package com.example.kotlinbasics

fun main() {
    /*
    var MyInt: Int = 20
    var MyByte: Byte = 12
    var MyLong: Long = 9_324_234_324_423_32_42_3
    var MyShort: Short = 200
    println(MyInt)
    println(MyLong)
    println(MyByte)
    println(MyShort)

    var MyFloat: Float = 20.6f
    println(MyFloat)
    var MyDouble: Double = 3.1492839723897
    println(MyDouble)


    var IsSunday: Boolean = true
    IsSunday = false
    println(IsSunday)


    var MyChar: Char = '3'
    println(MyChar)
    MyChar = Char.MAX_VALUE
    println(MyChar)

     */
    var str = "Hello"
    println(str.length)
    println(str.uppercase())
    println(str[0])
    for(i in str){
        print(i)
    }
    println("")
    println("$str.length = ${str.length}")
    println("$str.uppercase() = ${str.uppercase()}" )
}