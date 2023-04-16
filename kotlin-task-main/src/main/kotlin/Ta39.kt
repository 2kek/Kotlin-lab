import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()

    if (N in 10..99) {
        val sum = calcSum(N)
        println("\nЧисло содержит 2 знака, сумма цифр числа: $sum")
    } else if (N in 100..999) {
        val product = calcProduct(N)
        println("\nЧисло содержит 3 знака, значит произведение ненулевых цифр числа: $product")
    }
}

fun calcSum(number: Int): Int {
    var sum = 0
    var n = number
    while (n > 0) {
        sum += n % 10
        n /= 10
    }
    return sum
}

fun calcProduct(number: Int): Int {
    var product = 1
    var n = number
    while (n > 0) {
        val digit = n % 10
        if (digit != 0) {
            product *= digit
        }
        n /= 10
    }
    return product
}

