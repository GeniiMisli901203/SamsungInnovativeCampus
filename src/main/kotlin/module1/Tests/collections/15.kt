package module1.Tests.collections

fun main() {
    val beyondTheWall = readln().split(", ").map { it }.toMutableList()
    val backToTheWall = readln().split(", ").map { it }.toMutableList()

    val allReturned = beyondTheWall.all { it in backToTheWall }
    println(allReturned)
}