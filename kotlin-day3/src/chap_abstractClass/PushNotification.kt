package chap_abstractClass

// 추상클래스 Notification 상속
class PushNotification(title: String) : Notification(title) {
    // 추상 클래스 상속을 위해 추상 메서드 구현
    override fun send() = println("푸시로 [$title] 발송")
}