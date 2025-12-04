package module1.Tests.collections

fun main() {
    val originalList = readln().split(" ")
    val originalSet = originalList.toSet()
    val word = readln()

    println(dropElements(originalList, word))
    println(dropElements(originalSet, word))
}

fun dropElements(collection: Collection<String>, word: String): List<String> {
    return collection.filter { it != word }
}
