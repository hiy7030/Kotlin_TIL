package Lec14

fun main() {
    val dto1 = PersonDto("나혜리", 100)
    val dto2 = PersonDto("유지민", 200)
    println("dto1.name = ${dto1.name}, age = ${dto1.age}")
    println("dto2.name = ${dto2.name}, age = ${dto2.age}")
    println(dto2)
}

// data class로 인해 getter,setter, constructor뿐만 아니라
// eqauls(), hashCode(), toString()메서드도 자동 생성됨
data class PersonDto(
   val name: String,
   val age: Int
)