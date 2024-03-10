코틀린의 변수는 null을 허용하지 않으며, 만약 null인 값이 들어갈 수 있는 변수라면 `?` 
통해 타입에 명시함으로서 일반적인 타입과 다르게 간주하여 변수를 사용할 수 있다.
```kotlin
var noNull: String = "no null"
var yesNull: String? = null 
```

## null이 가능한 타입만을 위한 기능
### Safe Call
null 아니면 실행하고, null이면 실행하지 않으며 그 값 그대로가 null이 된다.
```kotlin
val str: String? = "ABC"
str.length  // 불가능
str?.length // 가능
```
Safe Call은 null이 가능한 변수를 사용할 때 해당 변수명 뒤에 `?`를 붙이므로서 
해당 값이 null일 경우 실행하지 않도록 하는 안전한 호출 방법이다.

### Elvis 연산자
Safe Call과 함께 사용되는 기능으로 앞의 연산 결과가 null이면 뒤의 값을 사용하는 방법
```kotlin
val str: String? = "ABC"
str?.length ?: 0
```
위 `str?.length`의 값이 null일 경우 `?:` 뒤에 있는 값 0이 해당 연산의 결과값이 되며,
null이 아닌 경우에는 str의 길이가 결과값이 된다.

## nullable type -> 근데 절대 null이 될 수 없는 경우
### !! 연산자
```kotlin
fun startWith(str: String?) Boolean {
    return str!!.startWith("A")
}
```
`!!` 연산자를 통해 절대 null일 수 없는 변수를 컴파일러에게 알려줄 수 있다.
주의해야 하는 점은 혹시나 해당 변수에 null이 들어갈 경우 NPE가 발생하기 때문에 null일 수 없는 변수임이 확실한 경우에만 사용한다.