import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    val line1 = scanner.nextLine()
    val line2 = scanner.nextLine()

    scanner.useDelimiter("-")
    val num1 = scanner.next()
    val num2 = scanner.next()

    println(line1)
    println(line2)
    println(num1)
    println(num2)

}