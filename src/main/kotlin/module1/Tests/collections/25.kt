package module1.Tests.collections

fun solution(newSet: MutableSet<String>, oldSet: Set<String>): MutableSet<String> {
    val res = oldSet.filter { it[0] == 'A' || it[0] == 'a' }.toMutableSet()
    return res
}
fun main() {
    val set = mutableSetOf<String>()
    val input = readln().split(" ").toSet()
    println(solution(set, input).joinToString(" "))
}