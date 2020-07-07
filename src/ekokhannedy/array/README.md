# Array

## Apa itu array ?

Array adalah larik. Kotlin mengharuskan element-element didalam array mempunyai tipe data yang sama,
Tidak seperti PHP atau Javascript.

Syntax


`var/val namaArrayString : Array<String>  = arrayOf("Element 1", "Element 2")`
 
`var/val namaArrayInt : Array<Int>  = arrayOf(10_000, 1, 2)`

### Index Array
Sama seperti di PHP ataupun di JS, index element array dimulai dari 0 

### Operasi Array
Kotlin menyediakan beberapa fungsi built-in untuk array, misalnya:

    1. size
    2. get(index)
    3. [index]
    4. set(index,value)
    5. [index] = value
    
### Array Nullable
Defaultnya kotlin tidak mengizinkan element bernilai null. 
Kita bisa mengizinkan null namun harus menggunakan operator "?"

`val members : Array<String?> = arrayOfNulls(5)`
Penjelasan => Deklarasikan sebuah array bernama members sebanyak lima element dimana ke lima
element bernilai null secara default

Array juga dalam menentukan jumlah element yang ditampung bersifat final, artinya jumlah element tidak
dapat dikurangi atau ditambah. Jadi misal kita memesan sebanyak lima, maka lima sudah final.

Gunakan List jika datanya dinamis.