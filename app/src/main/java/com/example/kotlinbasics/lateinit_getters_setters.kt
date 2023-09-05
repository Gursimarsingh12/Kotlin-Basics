package com.example.kotlinbasics

class Car(mySpeed: Int, myColor: String){
    lateinit var myCar: String
//  Default getter and setter code is below which is done by kotlin on its own
/*
    var myOwner: String = "John"
        get() = field
        set(value) {
            field = value
        }
 */
/*    Custom Getter
    var mySeat: String = "Red"
            get(){
                return field.toLowerCase()
            }
 */
    var age: Int = 18
        get() = field
//        Custom setter
        set(value){
            field= if(value >= 18) age else throw IllegalArgumentException("Age for driving a car can not be less than 18")
        }
    var mySeller: String = ""
        private set
    init {
        this.myCar = "BMW"
        this.age = 18
        println("$myCar is of $myColor color and has speed of $mySpeed km/hr")
    }
}
fun main(){
    var BMW: Car = Car(40, "Red")
//    BMW.mySeller = "meet"       // Cannot assign value as set is private
}