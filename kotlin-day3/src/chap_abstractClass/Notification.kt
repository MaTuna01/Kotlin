package chap_abstractClass

abstract class Notification (val title: String){
    // 공통기능 - 그대로 사용 가능
    fun logSend() = println("[$title] 발송기록 저장")

    // 강제 구현 - 자식이 반드시 구현해야함(구현 책임 위임)
    abstract fun send()
}