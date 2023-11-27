fun main(args: Array<String>) {

    // v1

    // Creo el array con IntArray
    var arr1 = IntArray(10)

    // Muestro el array
    println(arr1.joinToString())

    // Modifico los valores del array
    for (i in 1..10){
        arr1[i - 1] = i
    }

    // Muestro el array
    println(arr1.joinToString())

    // v2

    // Creo el array con IntArray y lo relleno
    var arr2 = IntArray(10) { i -> i + 1 }

    // Muestro el array
    println(arr2.joinToString())
}