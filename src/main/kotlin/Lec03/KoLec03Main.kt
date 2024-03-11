package Lec03

class KoLec03Main {
    fun main() {
        var str = """
            어쩌구 저쩌구
            이러쿵 저러쿵
        """.trimIndent()
    }

    fun printAgeIfPerson(obj: Any?) {
        val person = obj as? Person // as?를 통해 obj가 null이 아니라면 Person으로 형변환
        println(person?.age) ?: 0L
    }
}