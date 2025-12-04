package module1.Tests.collections

fun names(namesList: List<String>) : List<String> {
    val mapa = mutableMapOf<String, Int>()

    for (name in namesList){
        mapa[name] = mapa.getOrDefault(name, 0) + 1
    }

    val nameCount = mutableListOf<String>()
    for ((name, count) in mapa){
        nameCount.add("The name $name is repeated $count times")
    }
    return nameCount
}
//The name Vasa is repeated 1 times
fun main() {
    val input = readln().split(", ")
    val result = names(input)
    for (i in result){
        println(i)
    }
}