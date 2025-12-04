package module1.Tests.OOP

class City(val name: String) {
    var degrees: Int? = 0
        set(value) {
            val temp = value ?: 0
            field = when (name){
                "Dubai" -> if (temp in -92 .. 57) temp else 30
                "Moscow" -> if (temp in -92 .. 57) temp else 5
                "Hanoi" -> if (temp in -92 .. 57) temp else 25
                else -> temp
            }
        }

}

// Don't remove this lines
fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    val cities = listOf(firstCity, secondCity, thirdCity)
    val validDegrees = cities.map { it.degrees ?: 0 }
    val minTemp = validDegrees.minOrNull() ?: 0
    val coldestCities = cities.filter { it.degrees == minTemp }

    if (coldestCities.size > 1) {
        println("neither")
    } else {
        println(coldestCities.first().name)
    }
}