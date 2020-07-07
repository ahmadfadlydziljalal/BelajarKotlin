# WHEN

https://kotlinlang.org/docs/reference/basic-types.html#booleans

#### Simplify dari Switch Case di bahasa pemrograman lain
` 
 var nilai = "A"
     when (nilai){
         "A" -> println("Cum Laude")
         "B" -> {
             println("Good")
         }
}`

#### When expression juga mendukung multiple option

`nilai ="D"
     when (nilai){
         "A" ,"B" ,"C" -> println("LULUS")
         "D" -> {
             println("Tidak lulus")
         }
`

#### When expression In

`nilai = "C"
     val batasNilai : Array<String?> = arrayOf("A", "B", "C")
     when(nilai){
         in batasNilai -> println("Lulus")
         !in batasNilai -> println("Tidak Lulus")
     }`

#### When expression Is

`var name = "Dzil"
     when(name){
         is String -> println("String")
         else -> "Not string"
     }`
     
 #### When sebagai pengganti if else ; pengecekan variable
 `val value = 90
      when{
          value > 90 -> {
              println("Master")
          }
          value > 80 -> println("Pinter")
          else -> println("Standard")
      }`