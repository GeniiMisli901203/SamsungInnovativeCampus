fun findByIndex(names: Set<String>): String {
    // Преобразуем Set в List для работы с индексами
    val namesList = names.toList()

    // Ищем индексы Alice и Victor
    val aliceIndex = namesList.indexOf("Alice")
    val victorIndex = namesList.indexOf("Victor")

    // Формируем результат
    val resultParts = mutableListOf<String>()

    if (aliceIndex != -1) {
        resultParts.add("${aliceIndex}")
    }

    if (victorIndex != -1) {
        resultParts.add("${victorIndex}")
    }

    return resultParts.joinToString(", ")
}

fun main() {
    val input = readLine()

    if (input == null || input.trim().isEmpty()) {
        println("Ошибка: ввод пуст")
        return
    }

    // Разбиваем строку по запятым, убираем пробелы, формируем Set
    val namesSet = input.split(",")
        .map { it.trim() }
        .toSet()

    // Вызываем функцию и выводим результат
    val result = findByIndex(namesSet)
    println(result)
}
