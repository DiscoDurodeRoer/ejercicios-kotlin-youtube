fun main(args: Array<String>) {

    println("Ingrese el valor del operador 1: ")
    val op1: Int = readln().toInt()

    println("Ingrese el valor del operador 2: ")
    val op2: Int = readln().toInt()

    val suma = op1 + op2
    val resta = op1 - op2
    val mult = op1 * op2

    println("Suma => $suma")
    println("Resta => $resta")
    println("Multiplicacion => $mult")

    if(op2 != 0){
        val division = op1 / op2
        println("Division => $division")
    }else{
        println("No se puede dividir entre 0")
    }

}
