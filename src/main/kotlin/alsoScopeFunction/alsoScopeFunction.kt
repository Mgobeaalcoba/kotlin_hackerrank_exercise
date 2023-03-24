package alsoScopeFunction

// .also nos permite obtener una variable, luego ejecutar un codigo con esa variable y luego devolverla como parametro
// para que pueda volver a ser utilizada por una función más adelante:

fun main() {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3").also {
            lista -> println("El valor original de la lista es $lista")
    }.asReversed()
    println(moviles)
}

/* Output:
El valor original de la lista es [Google Pixel 2XL, Google Pixel 4a, Huawei Redmi 9, Xiaomi mi a3]
[Xiaomi mi a3, Huawei Redmi 9, Google Pixel 4a, Google Pixel 2XL]

DATO IMPORTANTE SOBRE SCOPE FUNCTIONS:
apply y also devuelve el objeto completo directamente.
let, run, y with retorna el último valor de la lambda.
 */