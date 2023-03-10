// write your code here
fun getLastDigit(a: Int): Char = a.toString().last()

/* Do not change code below */
fun main() {
    val a = readln().toInt()
    println(getLastDigit(a))
}