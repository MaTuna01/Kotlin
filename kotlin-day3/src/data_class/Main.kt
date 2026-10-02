package data_class

fun main() {
    val t1 = NormalClass(100,200)
    val t2 = NormalClass(100,200)

    val t3 = DataClass(100,200)
    val t4 = DataClass(100,200)

    // 일반 클래스를 통해 생성된 객체 주소값 비교
    if (t1 == t2) println("같습니다") else println("다릅니다")

    // 데이터 클래스의 주 생성자에 의해 생성된 변수값 비교
    if (t3 == t4) println("같습니다") else println("다릅니다")

    // toString
    println(t1)
    println(t3)

    // copy
    val t100 = t3.copy()
    println("t3.a1 : ${t3.a1}")
    println("t100.a1(t3 복제본) : ${t100.a1}")

    // componentN - 객체분해
    val num1 = t3.component1() // 첫번째 변수 값
    val num2 = t3.component2() // 두번째 변수 값
    println("num1 : $num1")
    println("num2 : $num2")
    // 객체분해 - 구조 분해 선언
    val (num10, num20) = t3
    println("num10 : $num10")
    println("num20 : $num20")
}