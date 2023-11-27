fun main(args: Array<String>) {

    // Creo el array
    var arr1 = arrayOf(1,2,3,4,5)

    // Desordeno el array
    arr1.shuffle()

    // Muestro el array desordenado
    println("Array desordenado: ${arr1.joinToString()}")

    // Ordeno del array (ascendente)
    arr1.sort()

    // Ordeno del array (descendente)
    // arr1.sortDescending()

    // Muestro el array
    println("Array ordenado: ${arr1.joinToString()}")

}