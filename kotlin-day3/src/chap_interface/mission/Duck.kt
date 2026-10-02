package chap_interface.mission

class Duck : Flyable, Swimmable{

    override fun fly() {
        println("fly 메서드 호출")
    }

    override fun swim() {
        println("swim 메서드 호출")
    }
}