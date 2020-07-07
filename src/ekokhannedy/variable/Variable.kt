package ekokhannedy.variable

const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {

    val separator = "\n======================\n";

    println("Variable Declaration $separator");
    val firstName = "Ahmad Fadly";
    val age = 30L
    println("val firstName =  $firstName");
    println("val age =  $age");

    println("$separator Contoh Nullable")
    val lastName : String? = null
    println(lastName)
    println(lastName?.length)

    println("$separator Variable Constant")
    println("Masih belajar ${APP}, v $VERSION")

}