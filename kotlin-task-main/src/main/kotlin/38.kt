fun checkNumber(number: Int): Boolean {
    return number in 100..999   // true
}
fun main() {
    val number = 456
    if (checkNumber(number)) {
        val lastTwoDigits = number % 100
        println(lastTwoDigits)
    } else {
        println("Число не является трехзначным")
    }
}
