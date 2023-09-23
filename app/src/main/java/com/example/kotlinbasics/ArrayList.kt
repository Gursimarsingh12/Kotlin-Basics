package com.example.kotlinbasics

fun main(){
    var array_list = ArrayList<String>()

    array_list.add(0,"Jan")
    println("$array_list")
    var mutablelist = mutableListOf("Feb","March")
    array_list.addAll(mutablelist)
    var it = array_list.iterator()
    while(it.hasNext()){
        print("${it.next()} ")    // .hasNext() helps in checking that if an arraylist can iterate to next or not. .next() helps in iterating to next element.
    }
    println("\nSize of array list: ${array_list.size}")
    println("$it")    // prints the address of array_list
    print("Months are: ")
    for(i in it){
        print("$i ")
    }
   println("\nElement 0 is: ${array_list.get(2)}")

}