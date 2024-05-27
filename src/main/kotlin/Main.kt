fun main(args: Array<String>) {

    val pair = Pair<String, Int>("hello", 2)
    println(pair.toString())
    println(pair.first)
    println(pair.second)
    println(pair.toList())

    val triple = Triple("hello", 1, 0.1)
    println(triple.first)
    println(triple.second)
    println(triple.third)
    println(triple.toString())
}