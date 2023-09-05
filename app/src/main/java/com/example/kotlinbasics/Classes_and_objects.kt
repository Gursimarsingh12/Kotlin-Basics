package com.example.kotlinbasics
/*
class MobilePhone constructor(osName: String, brand: String, model: String){
    init {
        println("I have $brand $model which has $osName")
    }

}
fun main(){
    val Samsung = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
    val Iphone = MobilePhone("IOS", "Iphone", "14")
}

 */

class Person (firstName: String = "John", lastName: String = "Doe"){
//    Member Variables/Properties
    var age: Int ?= null
    var hobby : String = ""
    var firstName: String =  ""
    var eyeColor: String ?= null
//    If we have constructor or parameters then to print anything in class, we have to use init keyword
//    Initializer Block
    init {
    this.firstName = firstName
        println("$firstName's Full Name: $firstName $lastName")
    }
//    Member Constructor -> Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int)
        : this(firstName, lastName){
        this.age = if(age > 0) age else throw IllegalArgumentException("Age should be greater than 0")
    }
    constructor(firstName: String, lastName: String, age: Int, eyeColor: String): this(firstName, lastName, age){
        this.eyeColor = eyeColor
    }
//    Member Function - Function within class
    fun funHobby(){
        println("$firstName's Hobby is $hobby")
    }
}
fun main(){
    var Justin = Person("Justin", "Bob")
    Justin = Person("Justin", "Bob", 21)
    Justin = Person("Justin", "Bob", 21, "Blue")
    Justin.age = 23
    println("Justin is ${Justin.age} years old.")
    Justin.hobby = "watching Netflix"
    Justin.funHobby()
    var John = Person()
    John.hobby = "playing video games"
    John.funHobby()
}