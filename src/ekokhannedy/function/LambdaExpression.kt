package ekokhannedy.function

/*
*
* Lambda Expression
*
*  Simbol asli dari Java :
*       () -> {}
*
* 1. Function di kotlin adalah first class citizen, artinya dianggap seperti tipe data lainnya.
* 2. Bisa disimpan di variable, array, bahkan bisa dikirim ke parameter function itu sendiri
* 3. Lambda expression secara sederhana adalah function yang tidak memiliki nana
*
*    Deklarasi function pada umumnya kan seperti ini:
*       fun namaFunction(parameter){
*
*       }
*
*   Jika menggunakan lambda:
*
*       a. Variable : Syntax
*               val namaVariable: (parameter : tipeDataParameter) -> tipeDataReturn  = { parameterValue : tipeDataValue ->
*                    ** baris terakhir akan jadi return value
*               }
* */


fun main() {

    println("""
       Materi 1: Lambda In variable
       
       Syntax : `val/var` `:` `(namaParameter : tipeDataParameter)` `->` `tipeDataReturn` = `{}`:
       
    """.trimIndent())

    val lambdaInVariable: (string1: String, string2: String) -> String =
        { value1: String, value2: String ->
            val result = "$value1 $value2"
            result
        }

    println(lambdaInVariable("Kotlin1", " Kotlin2"))

    println("""
        ========================================================================================
        Materi 2: Kata Kunci It
        Jika parameter di dalam variable untuk menampung nilai return lambda cuma ada satu saja, 
        bisa menggunakan keyword `it`
    """.trimIndent())

    val lambdaIt: (string1 : String) -> String = {
        "Nilai It : $it"
    }

    println(lambdaIt("Raya Maudy"))



    println("""
        ========================================================================================
        Method References / Function References
        1. Cara kerjanya adalah, deklarasikan function terlebih dahulu
        2. Kemudian reference kan function tersebut mengguanakan keyword `::`
    """.trimIndent())

    fun toUpperCase(value1 : String) : String = value1.toUpperCase()
    val methodReference = ::toUpperCase
    println(methodReference("::Papa Raya"))



}