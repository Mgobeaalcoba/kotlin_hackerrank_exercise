package ordenarListas


fun main(args: Array<String>) {

    val numerosDeLoteria = listOf(11,22,43,56,78,66)
    println(numerosDeLoteria)

    // Ordenar con Sort
    val numerosSorted = numerosDeLoteria.sorted() // Ordena de forma ascendente
    println(numerosSorted)

    // Ordenar por orden descendiente
    val numerosDeLoteriaDescendiente = numerosDeLoteria.sortedDescending() // Ordena de forma descendente
    println(numerosDeLoteriaDescendiente)

    // Ordenar por condición
    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 } // Ordena según parametro pasado como lambda. En este ejemplo primero los mayores a 50 y luego los menores a 50
    println(ordenarPorMultiplos)

    // Shuffled
    val numerosAleatorios = numerosDeLoteria.shuffled() //Orden aleatorio
    println(numerosAleatorios)

    // Reversa
    val numerosEnReversa = numerosDeLoteria.reversed() //Orden contrarío al original
    println(numerosEnReversa)

    // Convertir lista de un tipo en listas de otro tipo
    val mensajesDeNumeros = numerosDeLoteria.map { numero -> "Tu numero de loteria es $numero" }
    println(mensajesDeNumeros)

    // Filtrar numeros
    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrados)



}