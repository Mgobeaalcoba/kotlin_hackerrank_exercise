package sets

// Ultima colection de Kotlin. A diferencia de listas y arrays no pueden tener elementos duplicados. En mapas tampoco podemos tener sets duplicados.

fun main(args: Array<String>) {

    //Creando un set inmutable
    val vocalesRepetidas = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u")
    println(vocalesRepetidas) // Resultado: [a, e, i, o, u]

    //Creando set mutables
    val numerosFavoritos = mutableSetOf(1,2,3,4)
    numerosFavoritos.add(5)
    println(numerosFavoritos) // Resultado: [1, 2, 3, 4, 5]

    //Eliminado elementos de set
    numerosFavoritos.remove(3)
    println(numerosFavoritos) // Resultado: [1, 2, 4, 5]

    //Traer el primer valor que cumpla una condición:
    val valorDelSet = numerosFavoritos.firstOrNull { numero -> numero > 2 }
    println(valorDelSet)

    // Eliminar dependiendo de una condición
    // numerosFavoritos.removeIf { numero -> numero.rem(2) != 0 } // Pido los pares. Es lo mismo que la linea de abajo:
    numerosFavoritos.removeIf { numero -> numero % 2 != 0 }
    println(numerosFavoritos)
}