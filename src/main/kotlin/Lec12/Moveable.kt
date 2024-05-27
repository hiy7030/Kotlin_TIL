package Lec12

// Kotlin에서의 익명 클래스
fun main() {
    moveSomething(object : Movable { // java에선 new 키워드 사용, kotlin에선 object 키워드 사용
        override fun move() {
            println("move method")
        }

        override fun fly() {
            println("fly method")
        }

    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}