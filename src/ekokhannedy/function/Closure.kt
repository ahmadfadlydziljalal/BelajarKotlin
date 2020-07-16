package ekokhannedy.function

fun main() {
    println("""
        Closures
        
        => Kemampuan sebuah function, lambda atau anonymous function berinteraksi dengan data-data disekitarnya dalam scope yang sama
        => Harap gunakan fitur ini dengan bijak
    """.trimIndent())

    var counter = 0;

    val lambdaIncrement: () -> Unit = {
        println("Lambda")
        counter ++
    }

    val anonymousIncrement = fun (){
        println("Anonymous")
        counter++
    }

    fun functionIncrement(){
        println("Common")
        counter++
    }


    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    println(counter.toString())


}