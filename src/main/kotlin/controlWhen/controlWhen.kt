package controlWhen

fun main() {
    val nombreColor = "Rojo"

    when (nombreColor) { // Similar al switch en Golang, Python y JavaScript
        "Amarillo" -> println("El $nombreColor es el color de la alegría")
        "Rojo", "Carmesi" -> println("El $nombreColor simboliza el calor")
        else -> println("Error: No reconocemos el color $nombreColor")
    }

    // When para rangos:

    val code = 198
    when (code) {
        in 0..199 -> println("Codigo bajo")
        in 200..299 -> println("Su numero está entre 200 y 299")
        in 300..399 -> println("Su numero está entre 300 y 399")
        else -> println("Codigo desconocido, algo ha fallado")
    }

    // Otra forma de usar el when para hacer la misma evaluación pero con signos de comparación sería:

    when {
        code < 200 -> println("Codigo bajo")
        code in 200..299 -> println("Su numero esta entre 200 y 299")
        code in 300..399 -> println("Su numero esta entre 300 y 399")
        else -> println("Error: codigo desconocido")
    }

    // When para asignación de variables inmutables (ventaja Kotlin)

    val tallaDeZapatos = 47
    val mensaje = when(tallaDeZapatos) {
        41,43 -> "Tenemos disponible"
        42,44 -> "Casi no quedan!"
        45 -> "Lo siento no tenemos disponible"
        else -> "No tengo info suficiente"
    }
    println(mensaje)
}