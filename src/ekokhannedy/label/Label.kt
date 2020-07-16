package ekokhannedy.label



fun main() {
    println("Menggunakan Label Pada Kotlin")
    println("""
        Label bisa digunakan di:
        1. continue
        2. break
        3. return pada lambda
    """.trimIndent())

    fun test(
        name: String,
        operation: (String) -> Unit
    ): Unit{
        return operation(name)
    }

    test("") test@ {
        if(it == ""){
            return@test
        }else{
            print(it)
        }
    }
}