package module1.Tests.OOP

class Vehicle(val name: String, val horsePower: Int) {
    inner class Engine(val horsePower: Int) {
        fun start() {
            println("RRRrrrrrrr....")
        }
        fun printHorsePower() {
            println("The $name vehicle has $horsePower horsepower.")
        }
    }
}
fun main() {
    val name = readln()
    val horsePower = readln().toInt()
    Vehicle(name, horsePower).Engine(horsePower).printHorsePower()
}