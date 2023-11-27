fun main(args: Array<String>) {

    // Pido un nombre
    println("Introduce un nombre")
    var nom = readln()

    // Invoco la funcion saludar
    saludar(nom)
}

// Funcion saludar
fun saludar(nombre: String) {
    println("¡Hola ${nombre}!")
}
