package Lec10

interface Flyable {
    fun act() { // default 키워드 없이 default 메서드 생성 가능
        println("파닥 파닥")
    }

//    fun fly() // 추상메서드
}