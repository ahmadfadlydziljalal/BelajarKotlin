package ekokhannedy.function


/*
* Seri ke 22
* */
fun printNama(firstName: String, lastName: String?){
    println("$firstName $lastName")
}

fun main() {
    println("""
        Function Named Argument 
        =======================
        
        Kemampuan kotlin memanggil nama variabel parameter pada saat penggunaan function.
        Sehingga urutan parameter bisa dirubah saat pemanggilan function tersebut
    """.trimIndent());

    printNama(lastName = "Dzil", firstName = "Ahmad")


}