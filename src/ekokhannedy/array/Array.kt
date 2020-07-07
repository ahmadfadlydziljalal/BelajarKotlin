package ekokhannedy.array

fun main() {
    val names : Array<String> = arrayOf("Ahmad", "Fadly", "Dzil" , "Jalal")
    names.set(3, "Ikram")

    println(names.size)
    println(names.get(1))
    println(names[2])
    println(names[3])

    val members : Array<String?> = arrayOfNulls(5)
    members.set(0, "Irwan")
    println(members[0])
    println(members[1])
}