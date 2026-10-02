package chap_interface

interface Inter1 {
    // 인터페이스의 변수
    // 값 초기화 불가
    // 구현 클래스에서 재정의 필요
    var a1 : Int

    // 일반 메서드
    fun inter1Method1() {
        println("Inter1의 interMethod1 입니다.")
    }
    // 추상 메서드(구현 없음)
    fun inter1Method2()
}