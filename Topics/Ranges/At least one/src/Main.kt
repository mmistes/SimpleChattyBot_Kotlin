fun main() {
    val (ran1min, ran1max) = Array(2) { readln().toInt() }
    val (ran2min, ran2max) = Array(2) { readln().toInt() }
    val num = readln().toInt()
    print(num in ran1min..ran1max || num in ran2min..ran2max)
}