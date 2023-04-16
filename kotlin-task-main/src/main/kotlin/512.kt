fun main() {
    println("Программа для нахождения суммы положительных нечётных чисел меньше m")
    print("Введите m: ")
    val m = readLine()?.toIntOrNull()

    if (m == null || m <= 0) {
        println("m должно быть положительным числом") }
    else {
        val sum = (1..m).filter { it % 2 == 1 }.sum()
        println("Сумма таких чисел = $sum")
    }
}
