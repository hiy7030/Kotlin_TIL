package Lec02

class KoLec02Main2 {
    fun main() {}

    fun startWithA1(str: String?): Boolean {
        return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다")
    }

    fun startWithA2(str: String?): Boolean? {
        return str?.startsWith("A")
    }

    fun startWithA3(str: String?): Boolean{
        return str?.startsWith("A") ?: false
    }
}