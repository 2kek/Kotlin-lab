import kotlin.math.pow

fun main() {
    print("Введите значение натурального числа n: ")
    val n = readLine()?.toIntOrNull()
    if (n == null || n < 1) {
        println("Некорректный ввод")
    } else {
        val sum = calculateSum(n)
        println("Сумма = $sum")
    }
}

fun calculateSum(n: Int): Double {
    var sum = 0.0
    var fact = 1.0
    for (i in 1..n) {
        fact *= i
        sum += (-1.0).pow(i) * (i + 1) / fact
    }
    return sum
}





