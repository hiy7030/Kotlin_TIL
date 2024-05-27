package Lec10

class Penguin(
    species: String,
) : Animal(species, 2), Flyable, Swimable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다~")
    }

    override val legCount: Int // Animal 클래스의 legCount에 대한 getter를 오버라이딩한 것
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 2   // 인터페이스 프로퍼티로 인한 getter 오버라이드라 backing field 없는 getter 생성 가능

}