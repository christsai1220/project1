package com.chris

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//    Human().hello()
    var s:String? = "abcde"
    s = null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(1,3))
    val h = Human(weight = 65.7f,height = 1.7f,name = "Chris")
    println(h.bmi())
    /*h.hello()
    val age : Int = 19
    //age = 22; error
    var name : String;*/
    val score = 87
    val c :Char = 'A'
//    println(score > 80)
    println(message = c.toInt() < 60)

}

class Human(name:String = "", var weight : Float, var height : Float) {
init {
    println("name = $name")
}
    fun bmi() : Float {
        val bmi = weight / (height*weight)
        return bmi
    }
    fun hello() {
        println("Hello Human")
    }
}