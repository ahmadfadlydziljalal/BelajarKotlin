package ekokhannedy.function

fun factorialLoop(value: Int): Int {
    var result = 1
    for (i in value downTo 1) {
        result *= i
    }
    return result;
}

fun factorialRecursive(value: Int): Int {
    return when (value) {
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}

tailrec fun factorialTail(value: Int, result: Int = 1): Int {
    return when(value) {
        1 -> result
        else -> factorialTail(value - 1, result * value)
    }
}

fun main() {
    println(factorialTail(0))
}