package com.example.kotlinbasics

abstract class TVShow(open var ShowName: String, open var age: Int){
    abstract var ShowType: String
    fun ShowDetails(){
        println("$ShowName is a type of $ShowType type. " +
                "It is applicable for above or equal to $age years old people")
    }
    abstract fun enjoy()
}
class Sports(ShowName: String, age: Int, override var ShowType: String)
    : TVShow(ShowName, age){
    override fun enjoy(){
        println("Enjoyed the $ShowName by $age which is of type '$ShowType'.")
    }
}
class Cartoon(ShowName: String, age: Int, override var ShowType: String)
    : TVShow(ShowName,age){
    override fun enjoy() {
        println("Enjoyed the $ShowName by $age which is of type '$ShowType'.")
    }
}
fun main(){
    var Cricket: TVShow = Sports("Cricket", 15, "Sports")
    Cricket.ShowDetails()
    Cricket.enjoy()
    var Beyblade: TVShow = Cartoon("Beyblade", 6, "Cartoon")
    Beyblade.ShowDetails()
    Beyblade.enjoy()
}
// WE CAN USE "init" KEYWORD IN ABSTRACT CLASS