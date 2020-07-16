package ekokhannedy.function

// Contoh HOF dengan function sebagai parameter
// By default, jika function di definiskan inline, maka semua parameter bertipe inline
// Gunakan noinline pada parameter jika ada parameter yang tidak perlu di inline

/*println("""
        https://www.youtube.com/watch?v=b2U98ecql0s&list=PL-CtdCApEFH_hja5vRJgQOXylCiQud7Qa&index=37
        Inline Functions

        => Menggunakan HOF adalah salah satu fitur yang sangat berguna
        => HOF berdampak terhadap performa saat aplikasi berjalan, karena harus membuat object lambda berulang-ulang
           Jika penggunaanya tidak terlalu banyak mungkin tidak akan terasa.
        => Inline Functions adalah kemampuan di Kotlin yang mampu merubah HOF ke Inline function
        => Cara kerjanya adalah :
            1. HOF akan diduplicate.
            2. Saat runtime, aplikasi menjadi tidak perlu membuat objek lambda berulang-ulang
    """.trimIndent())*/
inline fun learn(
    int1: (aNumber: Int) -> Int,
    int2: (aNumber: Int) -> Int
): String {
    return "${int1(0).toString()} ${int2(0).toString()}"
}

fun main() {
    for (i in 1..3){
        println(
            learn(
                { aNum1 : Int ->  1 },
                { aNum2 : Int ->  2 }
            )
        )
    }
}