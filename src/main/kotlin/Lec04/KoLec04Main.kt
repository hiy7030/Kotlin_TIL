package Lec04

class KoLec04Main {
    fun main() {
        val money1 = JavaMoney(2_000L)
        val money2 = JavaMoney(1_000L)

        if(money1 > money2) { // 비교 연산자가 자동으로 compareTo()를 호출하여 수행
            println("Money1이 Money2보다 금액이 큽니다.")
        }

        if(money1 === money2) {
            print("Money1과 Money2의 값은 같습니다.")
        }

        if(money1 == money2) {
            print("Money1과 Money2의 주소값은 같습니다.")
        }

        if(fun1() || fun2()) {
            println("본문")
        }

        val money3 = Money(1_000L)
        val money4 = Money(3_000L)
        println(money3 + money4)
    }
    fun fun1(): Boolean {
        println("fun 1")
        return true
    }

    fun fun2(): Boolean {
        println("fun 2")
        return false
    }
}