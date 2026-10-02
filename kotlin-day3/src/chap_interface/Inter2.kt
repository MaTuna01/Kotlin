package chap_interface

interface Inter2 {
    var a2 : Int

    // 일반 메서드
    fun inter2Method1() {
        println("Inter2의 inter2Method1(일반 메서드) 입니다.")
    }

    // 추상 메서드(구현 없음)
    fun inter2Method2()
}