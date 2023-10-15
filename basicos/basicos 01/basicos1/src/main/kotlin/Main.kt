fun main(args: Array<String>) {

    // pedimos los valores
    println("Ingrese el valor del operador 1: ")
    val op1: Int = readln().toInt()

    println("Ingrese el valor del operador 2: ")
    val op2: Int = readln().toInt()

    // Hacemos las operaciones matematicas
    val suma = op1 + op2
    val resta = op1 - op2
    val mult = op1 * op2

    // Mostramos los valores
    println("Suma => $suma")
    println("Resta => $resta")
    println("Multiplicacion => $mult")

    // Solo hacemos la division si op2 es diferente de 0
    if(op2 != 0){
        val division = op1 / op2
        println("Division => $division")
    }else{
        println("No se puede dividir entre 0")
    }

}
