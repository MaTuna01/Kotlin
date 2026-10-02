package nested_class

fun main() {
    val obj1 = Outer1()
    val obj2 = obj1.Inner1()

    obj2.innerMethod1()
}