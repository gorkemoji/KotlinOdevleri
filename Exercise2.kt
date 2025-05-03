fun celciusToFahrenheit(celsius: Double): Double { return celsius * 1.8 + 32 }

fun perimeter(side1: Int, side2: Int): Int { return 2 * (side1 + side2) }

fun factorial(num: Int): Int {
    var result = 1
    
    for (i in 1..num) result *= i
    
    return result
}

fun aLetterCount(word: String): Int { return word.count { it.lowercaseChar() == 'a' } }

fun sumOfInteriorAngles(sideCount: Int): Int { return (sideCount - 2) * 180 }

fun findSalary(dayCount: Int): Int {
    val totalHours = dayCount * 8
    return if (totalHours <= 160) totalHours * 10
    else {
        val workingHours = totalHours - 160
        (160 * 10) + (totalHours * 20)
    }
}

fun quotaMoney(quota: Int): Int {
    return if (quota <= 50) 100
    else {
        val extra = quota - 50
        100 + (extra * 4)
    }
}

fun main() {
    println(celciusToFahrenheit(36.1))
    println(perimeter(2,3))
    println(factorial(5))
    println(aLetterCount("Merhaba"))
    println(sumOfInteriorAngles(3))
    println(findSalary(3))
    println(quotaMoney(54))
}
