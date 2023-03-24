package parametrosYArgumentos

fun main() {
    imprimirNombre(nombre = "Mariano", segundoNombre = "Daniel", apellido = "Gobea") // Argumentos explicitos en azul
}

fun imprimirNombre (nombre: String, segundoNombre: String = "", apellido: String) { // Parametros implicitos
    println("Mi nombre completo es $nombre $segundoNombre $apellido")
}