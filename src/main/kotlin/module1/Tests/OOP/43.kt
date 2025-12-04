package module1.Tests.OOP

open class Car2(model: String, speed: Int)

class Bus(val typeOfBus: String, val model: String, val speed: Int) : Car2(model, speed) {
    fun printInfo() = println("Type of bus: $typeOfBus, model: $model, speed: $speed")
}

// Don't remove this lines
fun main() {
    val bus = Bus("Personal", "N4", 130)
    bus.printInfo()
}