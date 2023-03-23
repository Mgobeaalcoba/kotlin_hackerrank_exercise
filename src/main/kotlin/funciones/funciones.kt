package funciones

fun main(args: Array<String>) {
    val letraAleatoria = "En Platzi nunca paramos de aprender"

    // Ejecuto función desde el metodo insertado al objeto String
    println("Desde Metodo de String: " + letraAleatoria.randomCase())
    // Ejecuto función desde la función general:
    println("Desde Función General: " + randomCase2(letraAleatoria))
}

// Función como Metodo añadido al objeto String:

private fun String.randomCase(): String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0) uppercase() else lowercase()
}

// Misma función (invertida) en formato función general:

fun randomCase2(frase : String) : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    if (resultadoAleatorio % 2 == 0) {
        return frase.lowercase()
    } else {
        return frase.uppercase()
    }
}