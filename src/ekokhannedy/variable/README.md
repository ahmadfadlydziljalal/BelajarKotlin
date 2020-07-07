# Penjelasan

## Kotlin mendukung dua jenis variable

    1. Mutable
        - Bisa dirubah kapanpun
        - Kata kunci : var
   
    2. Immutable, tidak bisa diubah
        - Setelah dideklarasikan, tidak bisa dirubah dibagian code yang lain
        - Kata kunci : val
   

## Direkomendasikan menggunakan Immutable dibanding Mutable.

Syntax Deklarasi variable:
`var/val namaVariable : tipeData = value`

Hal yang perlu diperhatikan adalah Kotlin mengizinkan deklarasi variable tidak secara explisit.
Jadi cukup dengan `var/val namaVariable = value`

### NULLABLE
    1. Secara standard, variable di Kotlin harus dideklarasikan / di-inisialisasikan nilai-nya
    2. Jika saat membuat variable tidak diberi nilai maka akan error
    3. Kotlin mendukung variable yang boleh null
    4. Ini dikarenakan Kotlin bisa meng-akses Java, dan kebanyakan di Java => semua variable bisa NULL
    5. Untuk membuat variable bisa bernilai NULL, di Kotlin bisa menggunanakan operator "?" <tanda tanya> setelah tipe datanya
    6. Penggunaan fitur ini tidak direkomendasikan untuk dilakukan di Kotlin, hanya sebagai jalan akhir, misal mengakses kode Java
    
### Variable Constant
    1. Constant adalah Immutable Data, biasanya diakses untuk keperluan global
    2. Global artinya bisa diakses dimanapun
    3. Untuk menandai bahwa variable tersebut adalah constant, biasanya mengguanakan UPPER_CASE dalam pembuatan nama variable.