package lambda

fun main() {

    // Como crear una lambda sin parametro con retorno implicito:
    val holaMundo : () -> Unit = {
        println("Hola Mundo")
    }
    holaMundo()

    // Como crear una lambda con parametro:
    val myLambda : (String) -> Int = {
        it.length // Puedo usar el argumento de forma implicita con "it"
    }

    val myLambda2 : (String) -> Int = { texto -> texto.length * 2 } // Puedo usar el argumento de forma explícita así y es una mejor práctica.

    // Como invocar una lambda
    val resultadoDeLambda = myLambda("Hola Mariano")
    println(resultadoDeLambda) // 12 → Largo de Hola Mariano

    // Como usar una lambda como argumento (parametro es en la construcción de la función).
    val listaDeString = listOf("A","B","C")

    val resultadoLambdaSinVariable = listaDeString.map { texto ->
        texto.length * 2
    } // Aquí paso la lambda como para
    println(resultadoLambdaSinVariable)

    val resultadoLambda= listaDeString.map(myLambda2)
    println(resultadoLambda)

}
