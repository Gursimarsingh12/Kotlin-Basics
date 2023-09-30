package com.example.kotlinbasics

// Exception Handling but there is no problem
/*
fun getNumber(str: String): Int{
    return try {
        Integer.parseInt(str)
    }
    catch (e: ArithmeticException){
        0
    }
}
fun main(){
    var str = getNumber("2")
    print(str)
}
 */

// Exception Handling
/*
fun getNumber(str: String): Int{
    return try {
        Integer.parseInt(str)
    }
    catch (e: NumberFormatException){
        0
    }
}
fun main(){
    var str = getNumber("2.5")
    print(str)
}
 */
fun main(){
    try {
        // var num = 10/0 -------> ArithmeticException catched
        // var arr = arrayOf(5)
        // arr[6] = 4  -----> ArrayIndexOutOfBoundsException catched
    }
    catch (e: NumberFormatException){
        print("NumberFormatException catched")
    }
    catch (e: ArithmeticException){
        print("ArithmeticException catched")
    }
    catch (e: ArrayIndexOutOfBoundsException){
        print("ArrayIndexOutOfBoundsException catched")
    }
    catch (e: Exception){
        print("parent class exception catched")
    }
}