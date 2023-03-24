package applyScopeFunction

// La función ".apply" nos permite realizar operaciones sobre una variable y luego devolver el valor... Aquí se diferencia de ".run" ya que en ella debemos devolver el valor
// con "this" al final del bloque ".run". En este caso eso deja de ser necesario:
// Combinada con el "safe pass" o "?" forman una función apply segura. Dado que si el programa se rompe devolveran "null"

fun main() {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3").apply {
        removeIf { movil -> movil.contains("Google") }
    }
    println(moviles)

    var colores : MutableList<String>? =  null // Puede ser MutableList of String o "null completa" en este caso
    colores?.apply { // Convierto nulables a no-nulables medianté aplly
        println("Nuestros colores son $this")
        println("la cantidad de colores es $size")
    } // No imprime nada porque es nulo. Pero la aplicación es segura dado que no rompe por el valor nulo al usar el "safe pass"

    colores = mutableListOf("Amarillo","Azul","Rojo") // Puede ser MutableList of String o "null completa" en este caso
    colores?.apply {
        println("Nuestros colores son $this")
        println("la cantidad de colores es $size")
    }
}