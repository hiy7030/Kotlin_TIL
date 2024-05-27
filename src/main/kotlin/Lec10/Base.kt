package Lec10

fun main() {
    Derived(2)
    /* 인스턴스 생성시 순서
    Base Class
    0  -> 하위 클래스의 필드가 초기화되기 전 상위 클래스에서 하위 클래스 필드에 접근하였기 때문!
    Derived Class
    * */
}

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number) // 상위에서 하위가 오버라이드하고 있는 프로퍼티를 생성자 블럭이나 init 메서드에서 접근 XXX
    }
}

// TODO : 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open를 피해야 한다.

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}