package controlIfElse

fun main(args: Array<String>) {

    val nombre : String = ""
    println(nombre)

    // Comprobación de if
    if (nombre.isNotEmpty()) println("El largo de nuestra variable nombre es ${nombre.length}") // Verifica si una cadena de texto está vacia
    else println("Error, nuestra variable esta vacia")

    // Asignación de if
    var mensaje : String
    if (nombre.length > 8){
        mensaje = "Tienes un nombre largo!"
    } else { // En el medio puede haber else if como en Golang por ejemplo
        mensaje = "Tienes un nombre corto"
    }
    println(mensaje)

    // Asignación de if inmutable
    val mensajeInmutable = if (nombre.length > 8) "Tienes un nombre largo!" else "Tienes un nombre corto"
    println(mensajeInmutable)

    // Asignación de variable inmutable con else if
    val mensajeInmutable2= if (nombre.length > 8) "Tienes un nombre largo!" else if(nombre.isEmpty()) "Este nombre esta vacio :(" else "Tienes un nombre corto"
    println(mensajeInmutable2)


}