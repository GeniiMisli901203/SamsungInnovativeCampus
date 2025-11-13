package module1.PR2

//a, e, i, o, u
fun main(){
    val str = readln()
    val res = countVowels(str)

}

fun countVowels (str: String): Int {
    var count = 0
    for (char in str){
        if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u') count++
    }
    return count
}