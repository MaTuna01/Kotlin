package chap_abstractClass.mission

import kotlin.math.pow

class Circle(val radius: Double) : Shape() {

    override fun area(): Double {
        val a = radius.pow(2.0) * 3.1415926535
        println("area : $a")
        return a
    }
}