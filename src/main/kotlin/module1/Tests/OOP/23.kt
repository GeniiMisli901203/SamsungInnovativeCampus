package module1.Tests.OOP

class Box(var height: Double, var width: Double, var length: Double) {
    fun getVolume() : Double{
        return height * width * length
    }
}
// Don't remove this lines
fun main() {
    val input = readln().split(" ").map { it.toDouble() }
    val box = Box(input[0],input[1],input[2])
    println("%.2f".format(box.getVolume()))
}