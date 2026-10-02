package nested_class

class Outer1 {
    var outerValue1 = 100

    fun outerMethod1() {
        println("Outer1의 outerMethod")
    }

    inner class Inner1 {
        var innerValue1 = 200

        fun innerMethod1() {
            println("outerValue1: $outerValue1")
            outerMethod1()
        }
    }
}