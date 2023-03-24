package runScopeFunction

// Run ejecuta una serie de operaciones luego de declarar una variable:
fun main() {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
        .run {
            removeIf { movil -> movil.contains("Google")}
            this
        }
    println(moviles)
}