package Lec13

fun main() {

}

class KotlinHouse(
    val address: String,
    val livingRoom: LivingRoom
) {
    // 중첩 클래스
    class LivingRoom(
       private val area: Double
    )
}

class OuterClass(
    val address: String,
    val inner: InnerClass
) {
    // 내부 클래스: 권장되지 않는 클래스 안의 클래스
    inner class InnerClass(
        private val area: Double
    ) {
        val address: String
            get() = this@OuterClass.address
        // 바깥 클래스 참조를 위해 'this@OuterClass' 사용
    }
}