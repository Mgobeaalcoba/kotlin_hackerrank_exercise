package tryCatchFinally

// No se considera una buena practica el manejo de excepciones con try/catch sino que deberían evitarse antes de la compilación.

fun main(args: Array<String>) {

    // Como lanzar una excepción
    //throw IllegalStateException("Error!")


    // Controlando las excepciones
    try {
        throw IllegalStateException("Error!") // throw se usa para lanzar excepciones a pedido
    } catch (e: Exception){
        println("Ha ocurrido un error")
    } finally{
        println("Ejecutando código final...")
    }

    // Try como expresion
    val primerValor = 10
    val segundoValor = 0
    val resultado: Int = try { primerValor / segundoValor } catch ( e: Exception ) { 0 } // Capturo cualquier excepción. Incluida la de división por cero
    println(resultado)

}