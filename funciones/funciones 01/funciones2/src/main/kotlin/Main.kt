fun main(args: Array<String>) {

    // Pide el primer numero
    println("Introduce el numero 1")
    var n1 = readln().toInt()

    // Pide el segundo numero
    println("Introduce el numero 2")
    var n2 = readln().toInt()

    // Llama a la función suma
    println("La suma es ${suma(n1, n2)}")

}

// Función suma
fun suma(op1: Int, op2: Int): Int {
    // Devuelve la suma de op1 y op2
    return op1 + op2
}
