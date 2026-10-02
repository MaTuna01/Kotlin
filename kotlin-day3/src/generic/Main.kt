package generic

fun main() {
    // T를 Int로 지정
    val t1 = GenericClass1<Int>()
    t1.testMethod1(100)

    val t2 = GenericClass1<String>()
    t2.testMethod1("안녕하세요")

    val t3 = GenericClass2<Int, Double, Boolean, String>(100, 11.0)
    t3.testMethod3(true, "문자열1")

    val t4 = GenericClass2<Double, String, Boolean, Int>(22.22, "문자열2")
    t4.testMethod3(false, 200)
}