import java.util.Scanner

fun isOrdered(n: Int): Boolean {
    var d = n % 10
    var p: Int
    var down = true
    var temp = n / 10

    while (temp != 0) { //пока не дойдем до 0
        p = d
        d = temp % 10
        temp /= 10
        if (p < d) {
            down = false
            break
        }
    }
    return down
}

fun main() {
    val sc = Scanner(System.`in`)
    print("Введите n: ")
    val n = sc.nextInt()

    if (isOrdered(n)) {
        println("Упорядочено")
    } else {
        println("Не упорядочено")
    }
}