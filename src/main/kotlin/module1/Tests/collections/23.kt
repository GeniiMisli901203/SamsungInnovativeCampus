package module1.Tests.collections

fun solution1(setSource: Set<String>, listSource: MutableList<String>): MutableSet<String> {
    val res = (setSource + listSource).toMutableSet()
    return res
}

fun main() {
    val input1 = readln().split(" ").toSet()
    val input2 = readln().split(" ").toMutableList()

    println(solution1(input1, input2).joinToString(" "))

}