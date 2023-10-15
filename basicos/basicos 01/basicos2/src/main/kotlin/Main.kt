fun main(args: Array<String>) {

    // Pedimos el valor del producto
    println("Ingrese el precio de un producto: ")
    val precio: Double = readln().toDouble()

    // El valor del IVA (21% de incremento)
    val IVA: Double = 1.21

    // Calculamos el precio final
    val precioFinal = precio * IVA

    // Mostramos el valor
    println("El precio final es => $precioFinal")

}