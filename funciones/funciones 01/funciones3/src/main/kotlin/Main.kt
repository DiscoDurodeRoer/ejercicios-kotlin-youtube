fun main(args: Array<String>) {

    // Pido un numero
    println("Introduce un numero")
    var n = readln().toInt()

    // Llamamos la función esPar que devuelve un booleano
    if(esPar(n)){
        println("Es par")
    }else{
        println("No es par")
    }

}

// Funcion esPar
fun esPar(n:Int): Boolean {
    return n % 2 == 0
}
