fun main(args: Array<String>) {

    println("Ingrese la cadena 1: ")
    val cadena1: String = readln()

    println("Ingrese la cadena 2: ")
    val cadena2: String = readln()

    if(cadena1.equals(cadena2, true)){
        println("Las dos cadenas son iguales")
    }else{
        println("Las dos cadenas no son iguales")
    }

}