package ekokhannedy.function

// Seri ke 25

// Sebuah function bernama kaliDua,
// membutuhkan parameter angka bertipe Integer,
// Mengembalikan data bertipe Integer (return)
fun kaliDua(angka: Int): Int = angka * 2

// Sebuah function bernama hi
// membutuhkan parameter name bertipe String,
// Mengembalikan data bertipe Unit (Void) alias tidak mengembalikan nilai
fun hi(name: String): Unit = println("Hi $name")

fun main() {

    val result = kaliDua(4)
    println(result)
    hi("Dzil")



}