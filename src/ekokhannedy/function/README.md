#Function

Parameter pada function di Kotlin defaultnya adalah val

    1. Function
    2. Function Parameter
    3. Function Default Parameter
    4. Funtion Named Parameter
    
## Unit Returning Function
    1. Function yang mengembalikan nilai (defaultnya adalah Unit)
    2. Function yang tidak mengembalikan nilai (e.g Java : void)
    
## Single Expression Function

Cocok untuk function yang singkat, misal function satu baris. 
Contoh:
`fun kaliDua(angka: Int): Int = angka * 2`

## VarArgsParameter Function

Syarat:
    
    1. varargs adalah kata kunci untuk parameter function yang berada paling terakhir, paling kanan deklarasi parameter
    2. varargs dapat dianggap sebagai sebuah array
    
## Extension Function
    
    1. Menambahkan function pada tipe data yang sudah tersedia sebelumnya
    2. Harus bijak, nanti terlihat seperti Magic
    3. Bisa digunakan juga jika Kita menggunakan library orang lain namun kita ingin membuat fungsi sendiri
    
## Function Infix Notation

    1. Operasi yang biasa dilakukan di operasi matematika
    2. Bisa juga untuk String
    
Contoh kasus dalam Bahasa Indonesia
https://dosenbahasa.com/contoh-kalimat-infiks

## Function Scope

    Anggaplah seperti Inner Class, ini adalah Inner Function . Karena Kotlin mengizinkan function dapat diakses diseluruh daerah project
    
    
## Return if & When

Keyword 'return' bisa digunakan sebelum deklarasi if atau when. Contoh:

'return if (name == "") {
         "Hello Bro"
     } else {
         "Hello $name"
     }'
     
## Recursive function
    1. Function yang memanggil function dirinya sendiri
    2. Kadang dalam pekerjaan, Kita sering menemui kasus dimana menggunakan recursive function lebih memudahkan. Biasanya tanpa recursive function ini, programmer menggunakan perulangan
    3. Contohnya adalah faktorial

Hal unik: 
https://www.rumusstatistik.com/2018/03/mengapa-faktorial-nol-sama-dengan-1.html

## Tail Recursive Function

    1. Kotlin akan memerintahkan Recursive function yang kita buat menjadi perulangan biasa.
    2. Syarat-syaratnya :
        a.Tambahkan tailrec di functionnya
        b.Saat memanggil function dirinya sendiri, hanya boleh memanggil dirinya sendiri, tanpa embel-embel operasi dengan data lain