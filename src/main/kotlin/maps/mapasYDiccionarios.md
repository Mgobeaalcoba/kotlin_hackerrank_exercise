## ¿Como se conoce a los diccionarios de Python en Kotlin y Golang respectivamente?

En Kotlin, los diccionarios se conocen como "Mapas". Se utilizan para almacenar pares clave-valor y se pueden acceder a los valores a través de sus claves. Un ejemplo de creación y uso de un mapa en Kotlin sería:

**Kotlin**

```
val miMapa = mapOf("clave1" to "valor1", "clave2" to "valor2")
println(miMapa["clave1"]) // Imprime "valor1"
```

En Golang, los diccionarios se conocen como "Mapas" o "Map". También se utilizan para almacenar pares clave-valor y se pueden acceder a los valores a través de sus claves. Un ejemplo de creación y uso de un mapa en Golang sería:

**Go**

```
miMapa := make(map[string]string)
miMapa["clave1"] = "valor1"
miMapa["clave2"] = "valor2"
fmt.Println(miMapa["clave1"]) // Imprime "valor1"
```

En ambos lenguajes, los mapas son estructuras de datos muy útiles para almacenar información en forma de pares clave-valor y son ampliamente utilizados en la programación.