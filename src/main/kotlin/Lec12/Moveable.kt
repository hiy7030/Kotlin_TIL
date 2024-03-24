package Lec12

// Kotlin에서의 익명 클래스
fun main() {
    moveSomething(object : Movable {
        override fun move() {
            TODO("Not yet implemented")
        }

        override fun fly() {
            TODO("Not yet implemented")
        }

    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}