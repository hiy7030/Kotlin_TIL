package Lec08

fun main() {
    repeat("test")
}

fun max(a: Int, b: Int): Int = if(a > b) a else b

fun repeat(str: String,
           num: Int = 3,
           userNewLine: Boolean = true
) {
    for(i in 1..num) {
        if(userNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printAll(vararg strings: String) {
    for(str in strings) {
        println(str)
    }
}