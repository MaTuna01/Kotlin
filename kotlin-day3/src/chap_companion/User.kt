package chap_companion

class User {
    companion object {
        var count : Int = 10

        init {
            count++
        }
    }
}