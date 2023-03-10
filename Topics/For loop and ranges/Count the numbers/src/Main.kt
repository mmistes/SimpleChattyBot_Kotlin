const val INPUTS = 3
fun main() {
    val (a, b, n) = List(INPUTS) { readln().toInt() }
    var counter = 0
    for (i in a..b) {
        if (i % n == 0) { counter++ }
    }
    println(counter)
}