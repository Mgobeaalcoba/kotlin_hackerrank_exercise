package letScopeFunction

fun main(args: Array<String>) {
    var nombre: String? = null
    nombre?.let { valor ->
        println("El nombre no es nulo, es $valor") // .let verifica si es nulo. Si lo es no ejecuta el codigo entre llaves {}
    }
    nombre = "Giuseppe"
    nombre?.let {
        println("El nombre no es nulo, es $it") // .let cuando el valor no es nulo ejecuta el bloque entre llaves {}
    }

    // Dentro de las llaves del let se establece una lambda function: ya sea explicita "valor -> valor..." o implicita "it" (mala práctica)
}