package ekokhannedy.perulangan.breakcontinue

fun main() {

    var i = 0

    while (true){

        println(i)
        if(i > 3) break
        i++

    }
    for (i in 0..100){
        if(i % 2 == 0)
            continue

        println(i)
    }

}