package mostActive

fun mostActive(clientes: Array<String>): Array<String> {
    val n = clientes.size
    val operacionesTotales = n.toDouble()
    val contadorOperaciones = mutableMapOf<String, Int>()

    // Contar el número de operaciones por cliente
    for (cliente in clientes) {
        if (contadorOperaciones.containsKey(cliente)) {
            contadorOperaciones[cliente] = contadorOperaciones[cliente]!! + 1
        } else {
            contadorOperaciones[cliente] = 1
        }
    }

    // Filtrar los clientes que tienen al menos el 5% de las operaciones
    val clientesActivos = contadorOperaciones.filterValues { it / operacionesTotales >= 0.05 }.keys.toTypedArray()

    // Ordenar los clientes activos alfabéticamente
    clientesActivos.sort()

    return clientesActivos
}

fun main() {
    val clientes = arrayOf("Bigcorp", "Bigcorp", "Acme", "Bigcorp", "Zork", "Zork", "Abc", "Bigcorp", "Acme", "Bigcorp", "Bigcorp", "Zork", "Bigcorp", "Zork", "Zork", "Bigcorp", "Acme", "Bigcorp", "Acme", "Bigcorp", "Acme", "Littlecorp", "Nadircorp")
    val clientesActivos = mostActive(clientes)
    println(clientesActivos.joinToString(", "))
}