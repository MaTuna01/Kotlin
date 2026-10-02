package chap_interface


// 단일 인터페이스 사용
class TestClass3 : Inter1 {
    override var a1 = 100

    override fun inter1Method2() {
        println("TestClass3의 interMethod2입니다.")
    }
}