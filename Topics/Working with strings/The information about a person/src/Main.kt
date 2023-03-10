fun main() {
    val (firstName, secondName, age) = readln().split(" ")
    print("${firstName.first().uppercase()}. $secondName, $age years old")

}