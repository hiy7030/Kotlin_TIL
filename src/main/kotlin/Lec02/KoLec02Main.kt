package Lec02

import java.lang.IllegalArgumentException

class KoLec02Main {
    fun main() {
    }
    // 파라미터 str이 null일 수 있기 때문에 타입에 ?를 사용하여 null일 수 있는 변수임을 명시해야 한다.
    fun startWithA1(str: String?): Boolean {
        if(str == null) {
            throw IllegalArgumentException("null이 들어왔습니다.")
        }
        return str.startsWith("A")
    }

    fun startWithA2(str: String?): Boolean? {
        if(str == null) {
            return null    // 반환 타입도 null일 수 있는 변수 타입임을 명시해야 한다.
        }
        return str.startsWith("A")
    }

    fun startWithA3(str: String?): Boolean {
        if(str == null) {
            return false
        }
        return str.startsWith("A")
    }
}