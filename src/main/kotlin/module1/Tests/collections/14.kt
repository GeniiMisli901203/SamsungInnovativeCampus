package module1.Tests.collections

fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()

    val res = numbers.sum()
    numbers.add(0, res)
    numbers.removeAt(numbers.size-2)

    println(numbers.joinToString(" "))
}