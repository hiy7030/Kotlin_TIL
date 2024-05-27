package Lec14

// enum 분기처리 시, when을 사용하면 좋음 -> enum 추가되면 when에서 경고해줌
enum class Country(
    val code: String
) {
    KOREA("KO"),
    AMERICA("US")
}