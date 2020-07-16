package ekokhannedy.function

fun returnIf(name: String = ""): String {

//    if(name == ""){
//       return  "Hello Bro"
//    }else{
//        return "Hello $name"
//    }

    return if (name == "") {
        "Hello Bro"
    } else {
        "Hello $name"
    }

}

fun returnWhen(name: String?): String {

//    when (name) {
//        "" -> return "Hello Bro"
//        else -> return name
//    }

    return when (name) {
        null -> "Hello Bro"
        else -> "Hello $name"
    }

}


fun main() {
    println(returnIf("Ahmad"))
    println(returnWhen(null))
}