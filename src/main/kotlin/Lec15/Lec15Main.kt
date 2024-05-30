package Lec15

fun main() {
    // 1. 배열
    val array = arrayOf(100, 200)

    for(i in array.indices) println("$i ${array[i]}")

    for((idx, value)in array.withIndex()) {
        println("$idx $value")
    }

    array.plus(300)

    // 2. 컬렉션-List
    val numbers = listOf(100, 200) // 타입 추론으로 타입생략 가능, 불변 리스트
    val emptyList = emptyList<Int>() // 비어있기 떄문에 타입 명시

    val mutableList = mutableListOf(100, 200) // 가변 리스트

    // 3. 컬렉션-map
    val map = mutableMapOf<Int, String>()
    map[1] = "MONDAY"
    map[2] = "TUESDAY"

    val map2 = mapOf(1 to "MONDAY", 2 to "TUESDAY")

}