fun main(args: Array<String>) {

    // pedimos los numeros por teclado
    println("Ingrese el numero 1: ")
    val num1 = readln().toInt()

    println("Ingrese el numero 2: ")
    val num2 = readln().toInt()

    println("Ingrese el numero 3: ")
    val num3 = readln().toInt()

    // si el numero 1 es mayor que el numero 2 y 3, significa que es el mayor
    if(num1 > num2 && num1 > num3){
        println("El valor de $num1 es el mayor")
        // el numero 1 no es el mayor, comprobamos si el numero 2 es el mayor
    }else if(num2 > num3){
        println("El valor de $num2 es el mayor")
        // el numero 2 no es el mayor, el unico que queda es el numero 3
    }else{
        println("El valor de $num3 es el mayor")
    }

}