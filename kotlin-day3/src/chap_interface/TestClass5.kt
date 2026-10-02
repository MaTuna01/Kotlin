package chap_interface

// 다중 인터페이스를 통한 클래스 정의
class TestClass5: Inter1, Inter2 {

    override var a1 = 1000
    override var a2 = 2000

    override fun inter1Method2() {
        println("testClass5의 inter1Method2 입니다.")
    }

    override fun inter2Method2() {
        println("testClass5의 inter2Method2 입니다.")
    }
}