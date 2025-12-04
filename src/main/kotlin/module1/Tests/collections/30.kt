fun main() {
    val studentsMarks = mutableMapOf<String, Int>()
    var inputKey: String = ""

    while (true) {
        inputKey = readln()
        if (inputKey == "stop") {
            break
        }
        val inputValue = readln().toInt()
        if (!studentsMarks.containsKey(inputKey)) {
            studentsMarks[inputKey] = inputValue
        }
    }
    println(studentsMarks)
}