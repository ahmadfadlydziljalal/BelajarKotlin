package ekokhannedy.function


/*
*
* Di video youtube
*
* Seri Ke 20 s/d 23
*
* */

fun functionTanpaParameter(){
    println("function tanpa parameter")
}

// Tanda ? berarti bisa null namun tetap harus diisi
fun functionWithParameter(firstName : String, lastName : String?){
    if(lastName != null){
        println("$firstName $lastName")
    }else{
        println("$firstName")
    }
}

// Default parameter, syntax nya adalah: namaParameter : tipeData = DefaultData
fun functionDefaultParameter(firstName: String, lastName: String? = null){
    println("$firstName $lastName")
}

fun main() {
    functionTanpaParameter()
    functionWithParameter("Ahmad", "")
    functionWithParameter("Ahmad", "Fadly")

    functionDefaultParameter("Ahmad")
}