package Lec16

fun main() {
    val test = "안녕하시와요"
    println(test.lastChar())

    // 일반함수 호출
    3.add(4)

    // infix 함수호출
    3.add2(4)
    3 add2 4
}
// String 확장함수
fun String.lastChar(): Char {
    return this[this.lastIndex]
}

// infix 중위 함수
fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}