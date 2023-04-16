import java.util.*

fun gcd(a: Int, b: Int): Int =
     if (b == 0) a else gcd(b, a % b)

fun nok(a: Int, b: Int): Int = //
     a * b / gcd(a, b)

fun main() {
    val sc = Scanner(System.`in`)
    print("Введите первое натуральное число: ")
    val m = sc.nextInt()
    print("Введите второе натуральное число: ")
    val n = sc.nextInt()

    if (m > 0 && n > 0) {
        val result = nok(m, n)
        println("НОК ($m, $n) = $result")
    } else {
        println("Числа m и n не являются натуральными")
    }
}