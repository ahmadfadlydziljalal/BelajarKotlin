package ekokhannedy.range

fun main() {

    val namaRange = 1..100 // Artinya pesan range 1,2,3 s/d 100
    println(namaRange)
    println(namaRange.count())
    println(namaRange.contains(50))
    println(namaRange.contains(120))


    val namaRangeDown = 100 downTo 1
    println(namaRangeDown)

}