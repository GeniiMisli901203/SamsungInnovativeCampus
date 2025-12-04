package module1.Tests.collections

fun evenFilter(numbers: Set<Int>): Set<Int> {
    val res = numbers.filter { it % 2 == 0 }.toSet()
    return res
}

fun main() {
    val input = readln().split(" ").map { it.toInt() }.toSet()
    println(evenFilter(input).joinToString(" "))
}