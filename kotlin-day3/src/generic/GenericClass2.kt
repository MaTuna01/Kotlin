package generic

class GenericClass2<A,B,C,D>(var a1:A, var a2:B) {
    fun testMethod3(a3: C, a4: D) {
        println("a1 : $a1")
        println("a2 : $a2")
        println("a3 : $a3")
        println("a4 : $a4")
    }
}