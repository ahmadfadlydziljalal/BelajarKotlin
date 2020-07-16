package ekokhannedy.function

/*
*
* Function Varargs Parameter
*
* Parameter yang berada di posisi terakhir, memiliki kemampuan dijadikan sebuah varargs
* Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam Array
*
* Apa bedanya dengan parameter biasa dengan tipe data Array
*
* => Jika parameter bertipe array, kita harus deklarasikan array nya terlebih dahulu
*
* */


fun countAmount(name: String?, vararg values : Int) : Int{
    var total = 0;

    for (value in values){
        total +=  value
    }

    return total;
}

fun main() {
    println(countAmount("Belajar Varargs",3,3))
}