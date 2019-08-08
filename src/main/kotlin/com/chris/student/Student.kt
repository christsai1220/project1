package com.Kotlin

import java.util.*

fun main(args: Array<String>) {
/*    userInput()*/
    val stu = Student("Chris", 95, 96)
    stu.print()
    val test = "123"
    println("test is:$test")
    println("High score: ${stu.highest()}")


}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    println("Please Input Your name:")
    //val name = scanner.next()
    val name = null
    println("Please Input Your english score:")
    val english = scanner.nextInt()
    println("Please Input Your math score:")
    val math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
}

class Student(var name:String?, var english:Int, var math:Int) {
    fun print() {
        println(name + '\t' + english + '\t' + math + '\t' +
                getAverage() +
                if(getAverage() >= 60) "pass" else "failed"
        )
    }

    fun getAverage():Int{
        return (english + math) / 2
    }

    fun highest():Int{
        var max = if (english > math) {
            println("english")
            english
        }
        else{
            println("math")
            math
        }

        /*if (english > math) {
            max = english
        }
        else{
            max = math
        }*/
        return max
    }

    fun nameCheck(){
        println(name?.length)
    }
}