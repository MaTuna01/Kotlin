package nested_class.anonymous_nested_class

fun main() {
    // 일반적인 방법
    val t1 = NormalClass()

    t1.inter1Method1()
    t1.inter1Method2()

    // 익명 중첩 클래스 - object : 인터페이스 {구현}
    val t2 = object : Inter1 {
        override fun inter1Method1() {
            println("익명 중첩 클래스의 innerMethod1")
        }

        override fun inter1Method2() {
            println("익명 중첩 클래스의 innerMethod2")
        }
    }

    t2.inter1Method1()
    t2.inter1Method2()
}