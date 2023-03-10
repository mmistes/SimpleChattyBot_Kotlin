const val CONST_NUMBS = 4
const val RANGE = 1000
fun main() {
    val (a, b, c, d) = List(CONST_NUMBS) { readln().toInt() }
    for (x in 0..RANGE) {
        if (a * x * x * x + b * x * x + c * x + d == 0) println(x)
    }
}
