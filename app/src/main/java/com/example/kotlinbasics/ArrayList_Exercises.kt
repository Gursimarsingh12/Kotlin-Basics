package com.example.kotlinbasics

fun main(){
    var DoubleArrayList = ArrayList<Double>(5)
    var mutable_list = mutableListOf<Double>()
    mutable_list.add(1.0)
    mutable_list.add(2.0)
    mutable_list.add(3.0)
    mutable_list.add(4.0)
    mutable_list.add(5.0)
    DoubleArrayList.addAll(mutable_list)
    println("$DoubleArrayList")
    var sum = 0.0
    for(element in DoubleArrayList){
        sum+=element
    }
    println("Average: ${sum/(DoubleArrayList.size)}")
}