package Lec12

fun main() {
    // Java에서 Static에 접근하려면 해당 클래스명.static변수/함수명 으로 접근이 가능했지만 Kotlin은 아래와 같이 접근 가능하다.
    // Person.Companion.newBaby("...")
    // 만약 Java에서처럼 접근하고 싶다면 해당 변수/함수에 @JvmStatic 어노테이션을 추가해줘야 한다.
    Person.newBaby("...")
    //companion object의 이름이 있다면 아래와 같이 접근 가능하다.
    Person.Factory.newBaby("...")
}

class Person private constructor(
    var name: String,
    var age: Int,
    ) {

    // Kotlin에서는 static 키워드를 사용하지 않고 companion object(동행 객체)라는 것을 사용한다.
    // val 키워드는 런타임 시 값이 할당, const(상수)키워드를 붙이면 컴파일 시 변수가 할당
    // const(상수) 키워드는 기본형과 String 타입에만 사용할 수 있다.
    // companion object는 하나의 객체로 간주되기 때문에 이름을 붙이거나, interface를 구현할 수 있다.
    companion object Factory : Log {
        const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("Person - companion object")
        }
    }
}

// Kotlin에서 싱글톤 구현하는 방법 object 키워드 사용 끝...
// 바로 싱글톤 이름으로 변수/함수에 접근이 가능하다.
object Singleton {
    var a: Int = 0
}
