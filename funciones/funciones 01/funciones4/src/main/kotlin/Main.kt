fun main(args: Array<String>) {

    // Pido un numero
    println("Introduce un numero")
    var n = readln().toInt()

    // Llamo a la funcion cuadrado
    println("El cuadrado es ${cuadrado(n)}")

}

// Funcion cuadrado en una sola linea
fun cuadrado(n: Int): Int = n * n