fun solution(first: Set<Int>, second: Set<Int>) {
    val size = second.size
    val result = first.filter { it % size == 0 }
    println(result.joinToString(" "))
}

fun main() {
    val firstLine = readLine()!!.split(" ").map { it.toInt() }
    val secondLine = readLine()!!.split(" ").map { it.toInt() }

    val firstSet = firstLine.toSet()
    val secondSet = secondLine.toSet()

    solution(firstSet, secondSet)
}