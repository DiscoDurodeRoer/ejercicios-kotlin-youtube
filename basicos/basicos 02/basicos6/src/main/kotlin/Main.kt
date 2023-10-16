fun main(args: Array<String>) {

    // pedimos un año
    println("Ingrese un año")
    val anio = readln().toInt()

    // Condicion para que sea bisiesto
    // Es lo mismo que => anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0
    val bisiesto = anio.rem(4) == 0 && anio.rem(100) != 0 || anio.rem(400) == 0

    // Mostramos si es o no bisiesto
    if(bisiesto){
        println("El año $anio es bisiesto")
    }else{
        println("el año $anio no es bisiesto")
    }

}