package Lec17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name.equals("사과")
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    isApple(fruits[0])
    isApple2.invoke(fruits[0])

    // 같은 함수
    val result = filterFruits(fruits, isApple)
    filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과" })
    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" } // 가독성을 위해 함수를 바깥에 작성 가능
    filterFruits(fruits) { fruit -> fruit.name == "사과" } // 타입 추론으로 인해 반환 타입 생략
    filterFruits(fruits) { it -> it.name == "사과" }

    for(n in result) {
        println("${n.name}, ${n.price}")
    }
}

private fun filterFruits(
    fruits: List<Fruit>,
    filter:(Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()

    for (fruit in fruits) {
        if(filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}