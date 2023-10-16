fun main(args: Array<String>) {

    // pedir un numero de la semana
    println("Ingrese un numero de la semana entre 1 y 7")
    val numSemana = readln().toInt()

    // mostramos el dia correspondiente
    when(numSemana) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")
        else -> println("el numero de la semana es incorrecto")
    }


}