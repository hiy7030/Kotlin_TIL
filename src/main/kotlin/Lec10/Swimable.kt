package Lec10

interface Swimable {

    val swimAbility: Int  // getter가 자동 생성되기 때문에 getter를 오버라이딩 해줘야 함

    val swimAbility2: Int
        get() = 2  // 인터페이스 내에서 값을 지정해준 경우 오버라이딩 필수 X

    fun act() {
        println("어푸 어푸")
    }
}