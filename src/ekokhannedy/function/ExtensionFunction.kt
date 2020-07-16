package ekokhannedy.function


// Dengan deklrasi ini maka String bawaan mempunyai method hello
// Magic...
fun String.hello() : String{
    return "Hello $this"
}

fun String.printHello() : Unit{
    println("Hello $this")
}

fun main() {
    val name = "Dzil"
    println(name.hello())

    "Jalal".printHello()
}