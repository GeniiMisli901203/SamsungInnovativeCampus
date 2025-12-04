package module1.Tests.OOP

class ArithmeticOperations (val x : Int, val y: Int){
    fun addition() = y + x
    fun subtraction () = y - x
    fun multiplication() = x * y
    fun division () = x / y


}
// Don't remove this lines
fun main() {
    val aop = ArithmeticOperations(readln().toInt(),readln().toInt())
    println(aop.addition())
    println(aop.subtraction())
    println(aop.multiplication())
    println(aop.division())
}

