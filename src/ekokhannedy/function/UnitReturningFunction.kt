package ekokhannedy.function

/*
* Seri 23
* */

// Unit bisa dihapus, supaya jelas saja
// Sama seperti di void
fun tidakMengembalikanNilai(name: String) : Unit{
    println("Hello $name")
}

// Return bisa bertipe number, String, Collection
fun mengembalikanNilai(name: String) : String{
    val hello = "Hi $name"
    return hello
}


fun main() {
    tidakMengembalikanNilai("Dzil")
    println(mengembalikanNilai("Dzil"))
}

