package nullSafety

import java.lang.NullPointerException

fun main() {
    val nombre : String? = null
    //Desactivar comprobación de nulos:
    //nombre!!.length // Fuerzo una excepción ya que null no tiene largo // NullPointerException

    //Llamada segura:
    //println("Length: ${nombre?.length}") //Trae e imprime el nulo sin romper el programa // Length: null

    //Operador Elvis '?:' : Una forma de trabajar los errores de nulos es evitandolos con el operador Elvis:
    val longitud = nombre?.length ?: 0
    println("Length: $longitud") // El operador Elvis reasigna el valor null a un dato valida y manejable como "0" en este ejemplo

    //"Safe Cast" u "Operador 'as?'
    /*
    Este operador se utiliza para realizar una conversión segura de un objeto a un tipo de dato específico.
    La conversión se considera segura porque, si el objeto no se puede convertir al tipo de dato especificado,
    el operador devuelve null en lugar de generar una excepción en tiempo de ejecución.

    Ej:
     */
    val obj : Any? = 5585 // Puede contener cualquier tipo de objeto o nulo
    // Quiero convertir el contenido de "obj" a tipo String? de forma segura:
    val str :String? = obj as? String // Si puede hacerlo lo va a hacer sino devolverá nulo en lugar de una excepción
    println("str es: $str")


    //Filtrar valores nulos de una lista:
    val listaConNulls: List<Int?> = listOf(null, 2, null, 4, null)
    println("Con nulls: ${listaConNulls}") // Con nulls: [null, 2, null, 4, null]

    val listaSinnNulls: List<Int?> = listaConNulls.filterNotNull()
    println("Sin nulls: ${listaSinnNulls}") // Sin nulls: [2, 4]

    //Otra forma de trabajar los errores es con Try Catch Finally capturando la excepción para que no rompa el programa:
    try {
        nombre!!.length
    } catch (excepcion : NullPointerException){ // Esto permite que nuestro programa concluya pese a haber sufrido ena excepción!!!
        println("Ha ocurrido un error. NO debe dejar valores nulos en su programa.")
    } finally {
        println("Cerrando aplicación de forma correcta!!!") // El bloque del finally sucede haya catch o no haya catch
    }

}