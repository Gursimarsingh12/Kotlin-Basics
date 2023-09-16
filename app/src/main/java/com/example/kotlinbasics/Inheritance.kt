package com.example.kotlinbasics

// Inheritance and Polymorphism
open class newCar(var name : String, var brand : String){
    open var range: Double = 0.0
    fun extendRange(amount : Double){
        if(amount > 0){
            range += amount
        }
    }
    open fun drive(distance : Double){
        println("$name $brand drove $distance kms with a range of $range.")
    }
}
class ElectricCar(name: String, brand: String, batteryLife: Double)
    : newCar(name, brand){
        override var range: Double = batteryLife/6
        override fun drive(distance: Double){
            println("$name $brand travels $distance in kms on electricity with range of $range")
        }
    }
fun main(){
    var Audi: newCar = newCar("Audi", "A5")
    Audi.extendRange(50.0)
    Audi.drive(1.0)
    var Tesla: ElectricCar = ElectricCar("Tesla", "S", 200.0)
    Tesla.drive(10.0)
}