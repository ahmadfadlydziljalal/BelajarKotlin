package ekokhannedy.perulangan.forloops

fun main() {
    val names : Array<String> = arrayOf("Ahmad", "Fadly", "Dzil" , "Jalal")
    for (name in names){
        println(name)
    }

    for (value in 0..100 step 10){
        println(value)
    }

    for(i in 50 downTo 40 step 3){
        println(i)
    }

    val ukuranNames = (names.size) - 1
    for (i in 0..ukuranNames){
        println("$i = ${names.get(i)}")
    }


}