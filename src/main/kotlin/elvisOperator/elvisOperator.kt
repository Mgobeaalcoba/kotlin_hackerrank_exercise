package elvisOperator

fun main() {
    val nombre : String? = null
    val caracteresDeNombre : Int = nombre?.length ?: 0 // nombre? es para manejo seguro de posibles nulos. ?: es para convertir el posible nulo a otro valor con el que podamos operar
    println(caracteresDeNombre)
}