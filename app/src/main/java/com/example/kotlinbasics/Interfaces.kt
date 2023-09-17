package com.example.kotlinbasics

interface Beverage{
    var beverageName: String
    var calorie: Double
    open fun tasty(){
        println("$beverageName is tasty and it has $calorie calories.")
    }
    fun madeOf()
}
open class Coffee(override var beverageName: String, override var calorie: Double, open var type: String) : Beverage{
    override fun tasty(){
//        println("$beverageName is tasty and it has $calorie calories.")
        super.tasty()
    }

    override fun madeOf() {
        println("$beverageName is made up of $type.")
    }
}
open class Tea(override var beverageName: String, override var calorie: Double, open var type: String): Beverage{
    override fun tasty(){
//        println("$beverageName is tasty and it has $calorie calories.")
        super.tasty()
    }

    override fun madeOf() {
        println("$beverageName is made up of $type.")
    }
}
fun main(){
    var Coffee: Beverage = Coffee("Coffee", 60.66, "Coffee beans")
    var Tea: Beverage = Tea("Tea", 55.23, "Tea Leaves")
    Coffee.tasty()
    Coffee.madeOf()
    Tea.tasty()
    Tea.madeOf()
}
// WE CANNOT USE "init" KEYWORD IN ABSTRACT CLASS