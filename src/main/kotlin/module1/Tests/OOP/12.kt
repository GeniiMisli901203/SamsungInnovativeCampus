package module1.Tests.OOP

class City4 (var name: String,){
    var population: Int = 0
        set (value){
            field = when{
                value < 0 -> 0
                value > 50_000_000 -> 50_000_000
                else -> value
            }
        }
}


fun main() {
    val city = City4("Moscow")
    city.population = -800
    println(city.population)
    city.population = 50000002
    println(city.population)
}