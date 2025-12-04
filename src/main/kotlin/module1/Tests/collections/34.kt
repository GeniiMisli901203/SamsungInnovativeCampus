package module1.Tests.collections

fun uniteBookLists(books1: MutableCollection<String>, books2: Collection<String>): Boolean {
    return books1.addAll(books2)
}

fun main() {
    val books1 = mutableSetOf("The Sound and the Fury", "The Wild Palms")
    val books2 = listOf("Light in August", "As I Lay Dying")

    println(uniteBookLists(books1, books2))
}