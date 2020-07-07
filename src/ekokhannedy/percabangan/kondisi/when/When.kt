package ekokhannedy.percabangan.kondisi.`when`

fun main() {

    var nilai = "A"
    when (nilai){
        "A" -> println("Cum Laude")
        "B" -> {
            println("Good")
        }
    }

    nilai ="D"
    when (nilai){
        "A" ,"B" ,"C" -> println("LULUS")
        "D" -> {
            println("Tidak lulus")
        }
    }

    nilai = "C"
    val batasNilai : Array<String?> = arrayOf("A", "B", "C")
    when(nilai){
        in batasNilai -> println("Lulus")
        !in batasNilai -> println("Tidak Lulus")
    }

    var name = "Dzil"
    when(name){
        is String -> println("String")
        else -> "Not string"
    }

    val value = 90
    when{
        value > 90 -> {
            println("Master")
        }
        value > 80 -> println("Pinter")
        else -> println("Standard")
    }




}