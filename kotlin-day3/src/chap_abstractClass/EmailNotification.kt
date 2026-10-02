package chap_abstractClass

// 추상 클래스 Notification 상속
class EmailNotification(title: String) : Notification(title) {
    // 추상 클래스 상속을 위한 메서드 구현
    override fun send() = println("이메일로 [$title] 발송")
}