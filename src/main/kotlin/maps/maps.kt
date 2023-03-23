package maps

// Los "maps" o "mapas" son pares de "clave 'to' valor" al igual que un diccionario en python o un map en golang (go)

fun main(args: Array<String>) {

    // Maps Inmutables
    val edadDeSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadDeSuperHeroes)

    // Maps mutables
    val edadDeSuperHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadDeSuperHeroesMutable)

    // Consultar un valor por su clave
    val edadIronman = edadDeSuperHeroesMutable["Ironman"]
    println("La edad de Ironman es $edadIronman")

    // Agregar elemento a un Map usando la función put
    edadDeSuperHeroesMutable.put("Wolverine", 45)
    edadDeSuperHeroesMutable.put("Wolverine", 58) // Intento duplicar una key con distinto value. Pero si ya existe pisa la data del value solamente.
    println(edadDeSuperHeroesMutable)

    // Usando asignación
    edadDeSuperHeroesMutable["Storm"] = 30
    println(edadDeSuperHeroesMutable)

    // Eliminar elemento de nuestro Map
    edadDeSuperHeroesMutable.remove("Wolverine")

    // Para conocer todas las keys de nuestro map .keys
    println(edadDeSuperHeroesMutable.keys)

    // Todos los valores del map usamos .values
    println(edadDeSuperHeroesMutable.values)



}