package com.example.kotlinbasics

fun main() {
    /*
    var age = 65

    if(age >= 18 && age <= 60){
        print("You can work")
    }
    else if(age > 60){
        print("You are old")
    }
    else{
        print("You are not eligible for work")
    }

    val age = 20
    val JuniorAge = 7
    val SeniorAge = 24
    val CurrentAge = if(age <= 18){
        print("You are a junior")
        JuniorAge
    }
    else{
        print("You are a senior")
        SeniorAge
    }
    print(" as your current Age is: $CurrentAge")




//    When statements
    var day = 6
    when (day) {
        1 -> println("Monday, You have to go school")
        2 -> println("Tuesday, You have to go school")
        3 -> println("Wed, You have to go school")
        4 -> println("Thurs, You have to go school")
        5 -> println("Friday, You have to go school")
        6 -> {
            println("Saturday, Today is Holiday")
            println("Sunday, Today is Holiday")
        }
        else -> print("Invalid Option")
    }
    var num: Any = "20.6f"

    when (num) {
        is Int -> println("$num is integer")
        !is Double -> println("$num is not Double")
        is String -> println("$num is String")
        else -> println("None of the above")
    }
    var season = 1
    when(season){
        in 3..5 -> println("Season is summer")
        in 6..9 -> println("Season is Monsoon")
        in 10..11 -> println("Season is Autumn")
        12, 1, 2 -> println("Season is Winter")
        else -> println("Invalid Season")
    }
    var age = 0
    when(age){
        in 18..60 -> println("You can work")
        in 0..18 -> println("You are not eligible to work")
        !in 0..60 -> println("You are old")   // 60..koi range nhi di isliye not in use kara
    }

     */
    val x : Any = 13.37
//assign when to a variable
    val result =  when(x) {
//let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
//then print x with the result
    print("$x $result")
}