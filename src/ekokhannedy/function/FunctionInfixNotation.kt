package ekokhannedy.function

infix fun String.ke(type: String) : String{
    if(type == "UP"){
        return this.toUpperCase();
    }
    return this.toLowerCase();
}

fun main() {
    val result =  "Ahmad Dzil" ke "UP"
    println(result)
}