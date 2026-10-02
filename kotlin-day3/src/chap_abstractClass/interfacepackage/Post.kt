package chap_abstractClass.interfacepackage

class Post(val content: String) : Likeable, Shareable {
    override fun like() = println("[$content] 좋아요!")
    override fun share() = println("[$content] 공유!")
}

// 다양한 타입으로 사용 가능
fun doLike(item: Likeable) = item.like()
fun doShare(item: Shareable) = item.share()

val post = Post("안녕하세요")