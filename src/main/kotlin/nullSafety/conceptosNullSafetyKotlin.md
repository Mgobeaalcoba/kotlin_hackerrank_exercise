**HomeKotlinKotlin, Gestión de nulos (Null Safety)**

*KOTLIN, GESTIÓN DE NULOS (NULL SAFETY)*

kotlin null safety
En Kotlin los objetos por defecto no aceptan valores nulos, para que le podamos asignar un null tendremos que indicar que ese objeto realmente puede ser null. De esta forma vamos a poder garantizar que no se no producirá un NullPointerException en tiempo de ejecución sin necesidad de llenar todo el código de comprobaciones if (a != null) o if (b == null) cuando las variables no deban ser null en ningún caso, pero también nos da una vía de escape para que podamos tener los queridos NullPointerException.

*NULL SAFETY, NO MÁS NULLPOINTEREXCEPTION*

Kotlin es Null Safety, es decir, que gestiona los nulos de forma segura, de modo que puedes garantizar que tu código no va a producir NullPointerException.

Para empezar por defecto los objetos en Kotlin por defecto son not-null y si intentamos asignarle un null a una variable directamente no va a compilar.

```
var nombre: String
nombre = null 
// Null can not be a value of a non-null type String
Sin null todo es muy bonito pero está claro que muchas veces si queremos que los objetos sí que sean nullables, para esto tenemos que añadir ? después del nombre del tipo.


var nombre: String?
nombre = null


var longitud: Int = nombre.length 
// Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
```

Y seguimos buscandole las cosquillas a Kotlin para que nos dé un NullPointerException intentando sacar la longitud de la cadena cuando es null, pero no nos deja porque no compila y nos dice que tenemos 2 opciones ?. si queremos hacerlo de forma segura o !!. si no queremos que el compilador compruebe si puede ser null.

**DESACTIVAR COMPROBACIÓN DE NULOS**

Si optamos por !!. hacemos que el compilador no compruebe si puede ser null y por lo tanto compilará sin problemas, eso si el resultado de la ejecución no será demasiado bueno… No se me ocurre ningún motivo para utilizarlo, pero bueno hay esta por si echamos de menos los null pointers…

```
var nombre: String? = null
var longitud: Int = nombre!!.length 
// Exception in thread "main" kotlin.KotlinNullPointerException
```

**LLAMADAS SEGURAS**

Lo lógico será que usemos ?. para que no falle. Si como en nuestro ejemplo el objeto es null cuando se intente sacar la longitud del nombre en lugar de lanzarse una excepción lo que sucederá es que devolverá null y por lo tanto nuestra variable longitud tiene que ser nullable para que compile correctamente. Si ejecutemos este código longitud es null.

```
var nombre: String? = null
// var longitud: Int = nombre?.length // Type mismatch: inferred type is Int? but Int was expected
var longitud: Int? = nombre?.length
println("Longitud: ${longitud}")
// Longitud: null
```

**EL OPERADOR ELVIS ( ?: )**

Si solo usamos ?. siempre vamos a poder recibir un null y por lo tanto estamos propagando a los siguientes objetos o funciones la necesidad de soportar nulos, pero puede que no sea lo que queramos. Para evitar esto podemos usar el operador Elvis ?: que nos permite definir un valor alternativo si se encuentra un null, por ejemplo para la longitud podríamos usar 0.

```
var nombre: String? = null
var longitud: Int = nombre?.length ?: 0
println("Longitud: ${longitud}")
// Longitud: 0
```

**SACAR LOS VALORES DISTINTOS DE NULL DE UNA LISTA**

Si tenemos una lista (o cualquier otro tipo de Collection) que tenga valores nulos, podemos filtrarlos fácilmente con la función .filterNotNull() para obtener solo los valores distintos de null.

```
val listaConNulls: List = listOf(null, 2, null, 4, null)
println("Con nulls: ${listaConNulls}")
// Con nulls: [null, 2, null, 4, null]

val listaSinnNulls: List = listaConNulls.filterNotNull()
println("Sin nulls: ${listaSinnNulls}")
// Sin nulls: [2, 4]
```

Y bueno aunque no lo he puesto se puede comprobar si un objeto es null o no utilizando if-else, pero si hay formas más sencillas de hacerlo ¿porque utilizarlos?

fuente: https://programandoointentandolo.com/2018/02/kotlin-gestion-nulos-null-safety.html