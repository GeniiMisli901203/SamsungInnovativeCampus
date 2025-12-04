package module1.Tests.OOP



open class Building(val height: Int) {
    constructor(height: Int, material: String) : this(height) {
    }
    // some initialization code
    class House(height: Int, val rooms: Int) : Building(height)


}



fun main() {
    val houseParameter = readln().split(" ").map {it.toInt()}
    val house = Building.House(houseParameter[0], houseParameter[1])
    println("${house.height} ${house.rooms}")

}