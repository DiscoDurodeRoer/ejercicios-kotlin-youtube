fun main(args: Array<String>) {

    // Creo el array
    var arr1 = arrayOf(1,2,3,4,5)

    // Lo desordeno
    arr1.shuffle()

    // Muestro el array
    println(arr1.joinToString())

}