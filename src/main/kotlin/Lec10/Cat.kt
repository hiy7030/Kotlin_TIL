package Lec10

class Cat(
    species: String // 타입 선언 시, 변수명: 타입명
) : Animal(species, 4) { // 상속시 자식 : 부모 (띄어쓰기의 중요성..)

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }

}