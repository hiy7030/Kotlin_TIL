package Lec10

abstract class Animal(
    protected val species:String,
    protected open val legCount: Int // getter를 오버라이딩하려면 open으로 열어줘야 한다.
    ) {
    abstract fun move()
}