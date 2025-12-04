package module1.Tests.collections

fun solution(numbers1: Set<Int>, numbers2: Set<Int>): Int {
    val res = (numbers1 - numbers2).size
    return res
}
fun main() {
    val a = readln().split(" ").map { it.toInt() }.toSet()
    val b = readln().split(" ").map { it.toInt() }.toSet()
    println(solution(a, b))
}