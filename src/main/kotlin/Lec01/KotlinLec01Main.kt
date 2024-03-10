package Lec01

class KotlinLec01Main {
    fun main() {
        // (1), (2)
        // 타입을 명시적으로 작성하지 않아도 컴파일 시 자동으로 추론해준다.
        var num1 = 10L   // (1) 가변
        val num2 = 10L   // (2) 불변

        // 타입을 명시하는 경우
        var variable: Long = 10L

        // 코틀린은 변수의 값을 초기화 하지 않으면 컴파일 에러가 발생한다.
        // var num -> 에러 발생, 타입 추론 불가능
        var num : Long  // 에러 발생 X
        println(num) // 에러 발생, 변수 초기화 필요

        num = 10L
        println(num) // 정상 실행

        // (3)
        /**
         * Java에서는 Long 타입(Reference)과 long타입(Primitive)은 다르게 구분되어 사용되며 연산이 필요한 경우에는
         * unboxing, boxing의 과정을 고려하여 long타입을 사용하도록 한다.
         * 코틀린은 Java와 다르게 이러한 과정들을 컴파일 시 자동으로 처리해주므로 Long타입 사용을 권장한다.
         * **/

        var num3 : Long = 1_000L

        /** Long 타입은 레퍼런스 타입으로 해당 객체에 null의 값이 들어갈 수 있다는 의미를 가진다.
         * 코틀린은 기본적으로 변수에 null값을 허용하지 않고 null이 들어갈 수 있는 변수를 다르게 간주하여 사용한다.
         **/
        var nullTest: Long = 10L
        nullTest = null // 에러 발생

        // null을 허용하는 경우
        var nullTest2: Long? = 10L   // ?를 타입에 명시하므로서 아예 다른 타입으로 간주된다.
        nullTest2 = null // 에러 발생 X

        // (4)
        // Java와 다르게 객체를 생성할 때 new 연산자를 사용하지 않는다.
        var person = Person("나혜리")
    }
}