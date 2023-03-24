package withScopeFunction

fun main() {
    // El with nos permite acceder, directamente, a las propiedades de una variable que le pasamos como parametro:
    // De esta forma nos ahorramos llamar a la variable varias veces sustituyendolo por this."propiedadX" o a su propiedad directamente:
    val colores = listOf("Azul", "Amarillo", "Rojo")
    with(colores) {
        println("Nuestros colores son: $this") //Llamo a colores con this
        println("Esta lista tiene una cantidad de colores de $size") // resumo colores.size que retorna la cantidad de elementos de mi lista como "size" solamente
    }

}