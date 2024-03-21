package Lec09

import java.lang.IllegalArgumentException

fun main() {
    Person()
}

class Person (
    name: String,
    var age: Int) {

    var name = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if(age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블럭")
    }

    val isAdult: Boolean
    get() = this.age >= 50


}