package com.example.kotlinbasics

fun main(){
    var list = listOf("Mon", "Tues", "Wed")
    println(list)
    for(day in list){
        print("$day ")
    }
    println("\nSize of list is: ${list.size}")
    var month = mutableListOf<String>("Jan","Feb","March","April")
    println("Months are: $month ")
//    month.add(5,"May")
//    println("$month ")
    var addMonth = arrayOf("May","June","July")
    month.addAll(addMonth)
    println("Adding some months: $month ")
    month.removeAt(5)
    println("Removing at index 5: $month ")
}