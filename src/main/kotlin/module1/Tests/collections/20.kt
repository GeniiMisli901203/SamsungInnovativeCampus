package module1.Tests.collections

fun solution(first: Set<String>, second: MutableList<String>): Boolean {
    val res = second.toSet()
    return first == res
}
fun main(){
    val input1 = readln().split(" ").toSet()
    val input2 = readln().split(" ").toMutableList()
    println(solution(input1, input2))
}