package ekokhannedy.function

// Transformer adalah lambda
fun hello(value: String, transformer : (string1 : String)  -> String ) : String{
    // val valueTransformer = transformer(value) // Kalau metode di deklarasikan terlebih dahulu
    return "Value from High Order: ${transformer(value)}"
}

fun main() {
    println("""
        Lambda akan menganggap baris terakhir di blok lambda sebagai hasil kembalian.
        Kadang Kita butuh membuat lambda yang se-fleksibel function, dimana kita bisa mengembalikan hasil dimanapun
        Untuk hal ini, kita bisa menggunakan Anonymous Function (AF).
        AF sebenarnya mirip dengan lambda, hanya cara membuatnya saja yang sedikit berbeda
        
        Syntax :
        `val` `namaFunction` `=`   `fun(namaParameter, tipeDataParameter) : 'tipeDataReturn' '{  body function }'
        
    """.trimIndent())

    val anonymousFun = fun(value : String): String {

        if(value.isBlank()){
            return "No Value Passed..."
        }

        return value.toUpperCase();
    }

    println(anonymousFun(""))
    println(hello("Dzil", anonymousFun))

    println("\nAnonymous Function As Parameter")
    println(hello("Dzil",fun(value : String): String {
        if(value.isBlank()){
            return "No Value Passed..."
        }
        return value.toLowerCase();
    }))

}