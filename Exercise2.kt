fun celciusToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

fun perimeter(side1: Int, side2: Int): Int {
    return 2 * (side1 + side2)
}

fun factorial(num: Int): Int {
    var result = 1
    for (i in 1..num) {
        result *= i
    }
    return result
}

fun aLetterCount(word: String): Int {
    return word.count { it.lowercaseChar() == 'a' }
}

fun main() {
    println(celciusToFahrenheit(36.1))
    println(perimeter(2,3))
    println(factorial(5))
    println(aLetterCount("Merhaba"))
}
