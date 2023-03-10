fun main() {
    val (a, b) = List(2) { readln().toLong() }
    var res: Long = 1
    for (i in a until b) {
        res *= i
    }
    print(res)
}