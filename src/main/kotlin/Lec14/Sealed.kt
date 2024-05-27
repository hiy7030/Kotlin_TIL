package Lec14

// enum class의 단점을 보완한 클래스
// 클래스 상속 o, 하위 클래스 멀티 인스턴스 o
// 컴파일 시, 하위 클래스의 타입을 모두 기억 -> 런타임시 클래스 타입 추가 X => when으로 분기 시 편리
sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante: HyundaiCar("아반떼", 1_000L)
class Sonata: HyundaiCar("소나타", 2_000L)
class Grandeur: HyundaiCar("그렌져", 3_000L)