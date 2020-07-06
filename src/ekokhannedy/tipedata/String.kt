package ekokhannedy.tipedata

fun main() {
    var firstName : String = "Ahmad Fadly"
    var lastName : String = "Dzil Jalal"
    var fullName : String = firstName + " " +  lastName
    var address = """
        ===========================
        Jalan Bunga Matahari No 33V
        Kendari, Sulawesi Tenggara
    """.trimIndent()

    var addressTrimMargin = """
        |===========================
        |Jalan Bunga Matahari No 33V
        |Kendari, Sulawesi Tenggara
    """.trimMargin() // default trim adalah tanda | pipeline

    println(firstName)
    println(lastName)
    println(fullName)
    println(address)
    println(addressTrimMargin)

    var fullNameWithStringTemplate : String = "$firstName $lastName"
    println(fullNameWithStringTemplate)

    var desc : String = "$fullName mempunyai panjang karakter: ${fullName.length}"
    println(desc)
}