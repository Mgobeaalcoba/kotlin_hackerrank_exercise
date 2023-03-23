package forForEachMapFilter

fun main(args: Array<String>) {

    // For

    val listaDeFrutas = listOf("Manzana","Pera","Piña","Frambuesa") // Armo una lista inmutable de frutas
    for (fruta in listaDeFrutas) println(fruta) // La itero con for e imprimo sus componentes

    //For Each

    listaDeFrutas.forEach{
        println("El nombre de la fruta es: $it ") // La itero con un forEach e imprimo su nombre en un template
    }

    //Map

    val nuevaLista = listaDeFrutas.map { it.length } // Armo una nueva lista aplicando la función map a la lista de frutas. Allí guardo sus largos
    println(nuevaLista) // Imprimo mi nueva lista

    // Otra forma de armar un map en Kotlin es:

    val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length }

    caracteresDeFruta.forEach{
        println("El largo del nombre de la fruta es: $it ") // La itero con un forEach e imprimo su nombre en un template
    }


    // El Map es una función clave para trabajar con variables inmutables sin tener que recorrer todo un iterable y agregando los nuevos valores a uno nuevo.

    //Filter

    val listaFiltrada = nuevaLista.filter { it > 4 } // Armo una lista filtrada con "filter" sobre la lista de largos
    println(listaFiltrada) // imprimo la lista filtrada

    // Tal como en map también existe otra forma de filtrar en Kotlin:

    val listaFiltrada2 = caracteresDeFruta.filter { largoDeFruta -> largoDeFruta > 5 }

    listaFiltrada2.forEach{
        println("El largo del nombre de la fruta es: $it ") // La itero con un forEach e imprimo su nombre en un template
    }

    //Utilizo el filtro para imprimir las frutas que deseo:

    for (fruta in listaDeFrutas) {
        for (largo in listaFiltrada) {
            if (fruta.length == largo) {
                println(fruta)
                break
            }
        }
    }

}