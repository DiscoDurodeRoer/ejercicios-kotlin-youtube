fun main(args: Array<String>) {

    println("Ingrese el precio de un producto: ")
    val precio: Double = readln().toDouble()

    val IVA: Double = 1.21

    val precioFinal = precio * IVA

    println("El precio final es => $precioFinal")

}