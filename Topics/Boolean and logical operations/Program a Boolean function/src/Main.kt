fun main() {
    val x = readLine().toBoolean() // read other values in the same way
    // write your code here
    val y = readLine().toBoolean() // read other values in the same way
    val z = readLine().toBoolean() // read other values in the same way

    val res: Boolean = !(x && y) || z
    println(res)
}