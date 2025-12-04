package module1.Tests.collections
fun main(){
    val myList: MutableList<Int> = (readln().split(" ").map { it.toInt() }).toMutableList()
    val strList: MutableList<String> = mutableListOf()
    for (i in myList.indices) {
        strList.add(myList[i].toString())
    }
    println(strList.joinToString(", "))
}






