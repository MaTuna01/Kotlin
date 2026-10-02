package chap_interface

// 단일 인터페이스 사용
class TestClass4 : Inter2 {
    override var a2 = 200

    override fun inter2Method2() {
        println("TestClass4의 inter2Method2입니다.")
    }
}