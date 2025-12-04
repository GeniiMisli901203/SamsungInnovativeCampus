package module1.Tests.OOP

class Car (var brand: String, var model: String, var year: Int){
    fun printInfo() {
        println("Car brand: $brand, Model: $model, Year: $year")
    }
}

fun main() {
    val car = Car(readln(), readln(), readln().toInt())
    car.printInfo()
}