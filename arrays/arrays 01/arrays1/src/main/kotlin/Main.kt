fun main(args: Array<String>) {

    // Crear un array vacio
    var arr1 = emptyArray<Int>()

    // Muestro el array
    println(arr1.joinToString())

    // Relleno el array
    for (i in 1..10) {
        arr1 += i
    }

    // Muestro el array de nuevo
    println(arr1.joinToString())

}