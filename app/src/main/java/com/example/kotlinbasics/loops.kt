package com.example.kotlinbasics

fun main(){
    /*
    var x = 100
    while(x >= 0){
        print("$x ")
        x-=2
    }
    println("\nwhile loop is done")


    // Do while
    var z = 1
    do{
        print("$z ")
        z++
    }while(z <= 10)
    println("")
//    for loop
    for(i in 1..10){
        print("$i ")
    }
    println("")
    for(i in 11 until 20){
        print("$i ")
    }
    println("")
    for (i in 30 downTo 0 step 2){
        print("$i ")
    }

     */
//    EXERCISES
//    Q1
    for(i in 0..10000){
        if(i == 9001){
            print("IT's OVER 9000!!!")
        }
    }
    println("")
//    Q2
    var humidity = "humid"
    var humidityLevel = 80
    while(humidity == "humid"){
        humidityLevel-=5
        println("Humidity decreased")
        if(humidityLevel < 60){
            println("It is comfy now")
            humidity = "comfy"
        }
    }
}