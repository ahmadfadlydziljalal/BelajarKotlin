package ekokhannedy.tipedata


fun main() {

    var title =
        "== Cara Baca Deklarasi Sebuah Variabel == \n" +
                "Dekalarasi sebuah variabel x dengan tipe y bernilai z\n"

    var subTitle = "Tipe Data Number \n"


    var stringInteger: String = "Integer";
    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2_000
    var balance: Long = 1_000_000_000_000L

    var stringFloating: String = "Floating";
    var floatValue: Float = 98.98F
    var longValue: Double = 234_000.54335

    var stringLiteral: String = "Literal"
    var decimalLiteral: Int = 100
    var hexaDecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0011

    println(title);
    println(subTitle);

    println("===========")
    println(stringInteger);
    println(age)
    println(height)
    println(distance)
    println(balance)

    println("===========")
    println(stringFloating);
    println(floatValue)
    println(longValue)

    println("===========")
    println(stringLiteral)
    println(decimalLiteral)
    println(hexaDecimalLiteral)
    println(binaryLiteral)

    println("===========")
    var titleConversion : String = "Cara Konversi Variable: \nnewVariable = oldVariable.toNewTipeData"
    println(titleConversion)
    println(binaryLiteral.toFloat())

}