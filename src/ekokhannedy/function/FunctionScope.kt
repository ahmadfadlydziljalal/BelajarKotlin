package ekokhannedy.function

//fun sayHello(){
//    // ERROR
//    innerFunction()
//}

fun main() {
    fun innerFunction(){
        println("Hello World")
    }

    innerFunction()
}