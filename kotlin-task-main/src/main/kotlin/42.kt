import java.util.*
import kotlin.math.*

fun main() {
    println("Посичтайка")
    val sc = Scanner(System.`in`)
    print("Введите ваше число: ")
    val b = sc.nextInt()

    if (b < 0) {
        var a = b   //toDouble?
        var i = 2
        while (a < 0) {
            a = ((a + abs(sin(i.toDouble()))) / (i - sin(i.toDouble()).pow(2))).toInt()
            i++
            println("a($i) = $a")
        }
        println("a = $a")
    } else {
        println("Число должно быть меньше нуля")
    }
}