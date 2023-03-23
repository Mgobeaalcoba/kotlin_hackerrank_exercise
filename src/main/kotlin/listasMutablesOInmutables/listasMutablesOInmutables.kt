package listasMutablesOInmutables

fun main(args: Array<String>) {

    // Declarar listas inmutables
    val listaDeNombres = listOf("Juan","Enrique","Camila")
    println(listaDeNombres)

    // Declarar listas mutables
    val listaVacia = mutableListOf<String>()
    println("Lista vacia = $listaVacia")

    // Agregar elemento a una lista mutable
    listaVacia.add("Juan")

    // Obtener un valor de la lista
    val valorUsandoGet = listaVacia.get(0)
    println("Primer valor usando la función get $valorUsandoGet")

    val valorUsandoOperadorIndexado = listaVacia[0]
    println("Primer valor usando operador indexado $valorUsandoOperadorIndexado")

    val primerValor = listaVacia.first() // Tmb se puede pasar como parametro una condición para que me envíe el primer elemento que cumple con una condición en especifico
    val primerValorONulo = listaVacia.firstOrNull() // Con alt+enter sobre una variable puedo ver el tipo "implicito" de una variable

    println("Valor usando la función first $primerValor")

    // Eliminar elementos de la lista

    // Elimina el elemento en la posición 0
    listaVacia.removeAt(0) // Solo podemos eliminar o agregar elementos en una lista mutable. No en una inmutable
    println("Lista vacia luego de eliminar el primer elemento $listaVacia")

    // Elimina el elemento cuando la condición se cumpla
    val listaDeApellidos = mutableListOf("Perez","Cruz","Rodriguez")
    listaDeApellidos.removeIf { apellido -> apellido.length > 5 }
    println("Lista de apellidos despues del filtro $listaDeApellidos ")

    // Arrays en Kotlin
    val myArray = arrayOf(1,2,3)
    println("Nuestro array $myArray") //Imprime el espacio en memoria que está ocupando. No su contenido
    println("Array como lista ${myArray.toList()}") //Transformo array a lista para poder imprimir su contenido

}