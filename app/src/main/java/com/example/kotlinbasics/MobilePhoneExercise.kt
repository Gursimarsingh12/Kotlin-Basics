package com.example.kotlinbasics

class MobilePhone constructor(osName: String, _brand: String, model: String){
//    var battery: IntRange = 0..50
    var brand: String = _brand
    private var battery = 30
    init {
        println("I have $brand $model which has $osName")
    }
    fun chargedBy(charged: Int){
        println("$brand's Battery was at $battery and now it will be charged to ${battery+charged}.")
        battery += charged
    }
}
fun main(){
    val Samsung = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
    Samsung.chargedBy(20)
    val Iphone = MobilePhone("IOS", "Iphone", "14")
}