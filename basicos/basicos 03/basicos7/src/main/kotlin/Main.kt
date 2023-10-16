fun main(args: Array<String>) {

    println("Del 1 al 10 con while")
    // Declaro la variable
    var i = 1
    // Condicion, mientras sea true volvera a entrar
    while(i <= 10){
        // Mostramos el valor
        println(i)
        // Incrementamos la variable en 1
        i++
    }

    println("Del 1 al 10 con do-while")
    // Reseteamos el valor a 1
    i = 1
    do {
        // Mostramos el valor
        println(i)
        // Incrementamos la variable en 1
        i++
        // Condicion, mientras sea true volvera a entrar
    } while(i <= 10)

}