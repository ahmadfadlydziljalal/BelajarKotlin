package ekokhannedy.function

fun generalFunction(value: String): String {
    return "Value from General Function: $value"
}

// Transformer adalah lambda
fun highOrderFunction(
    value: String,
    transformer: (string1: String) -> String
): String {

    return "Value from High Order: ${transformer(value)}"
    // val valueTransformer = transformer(value) // Kalau metode di deklarasikan terlebih dahulu
}

fun main() {
    println(
        """
    High Order Functions (HOF)
    
    1. HOF secara general adalah :
        a. Function yang menggunakan function sebagai parameter atau,
        b. Function yang mengembalikan function
    2. Penggunaan HOF berguna untuk :
        a. Ketika Kita ingin membuat function yang sangat general, dalam artian
            - Ingin mendapatkan input yang flexible berupa lambda.
            - Lambda tersebut dideklarasikan user ketika memanggil function tersebut.
    -------------------------------------------------------------------------------------
    """.trimMargin()
    )

    println("Penggunaan HOF")

    val upperTransformerFunction = { value: String -> value.toUpperCase() }
    val lowerTransformFunction = { value: String -> value.toLowerCase() }

    val penggunaanHOF1 = highOrderFunction("Dzil", upperTransformerFunction)
    val penggunaanHOF2 = highOrderFunction("Dzil", lowerTransformFunction)
    val penggunaanHOF3 = highOrderFunction("Dzil", { value: String -> value.toLowerCase() })

    println(penggunaanHOF1)
    println(penggunaanHOF2)
    println(penggunaanHOF3)

    println(
        """
    -------------------------------------------------------------------------------------
    Trailing lambda
    Jika lambda ada di parameter terakhir, maka lambda bisa ditulis setelah penulisan HOF
    """.trimIndent()
    )

    val penggunaanHOF4 = highOrderFunction("Dzil") { value: String -> value.toLowerCase() }
    println(penggunaanHOF3)


}