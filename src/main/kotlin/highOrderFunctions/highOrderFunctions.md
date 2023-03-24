## Funciones de orden superior

Kotlin es un **lenguaje orientado a objetos** pero introduce características existentes en los **lenguajes funcionales** que nos permiten crear un código más claro y expresivo.

**Una de las características del paradigma de la programación funcional son las funciones de orden superior.**

Las funciones de orden superior son funciones que pueden recibir como parámetros otras funciones y/o devolverlas como resultados.

Veremos una serie de ejemplos muy sencillos para ver como Kotlin implementa el concepto de funciones de orden superior y a medida que avancemos en el curso podremos ver las ventajas de este paradigma.

***Problema 1***

Definir una función de orden superior llamada operar. Llegan como parámetro dos enteros y una función. En el bloque de la función llamar a la función que llega como parámetro y enviar los dos primeros parámetros.
La función retorna un entero.

```
funoperar(v1: Int, v2: Int, fn: (Int, Int) -> Int) : Int {
return fn(v1, v2)
}

funsumar(x1: Int, x2: Int) = x1 + x2

funrestar(x1: Int, x2: Int) = x1 - x2

funmultiplicar(x1: Int, x2: Int) = x1 * x2

fundividir(x1: Int, x2: Int) = x1 / x2

funmain(parametro: Array<String>) {
val resu1 = operar(10, 5, ::sumar)
println("La suma de 10 y 5 es $resu1")
val resu2 = operar(5, 2, ::sumar)
println("La suma de 5 y 2 es $resu2")
println("La resta de 100 y 40 es ${operar(100, 40, ::restar)}")
println("El producto entre 5 y 20 es ${operar(5, 20, ::multiplicar)}")
println("La división entre 10 y 5 es ${operar(10, 5, ::dividir)}")
}
```

Tenemos definidas 6 funciones en este problema. La única función de orden superior es la llamada “operar”:

```
funoperar(v1: Int, v2: Int, fn: (Int, Int) -> Int) : Int {
return fn(v1, v2)
}
```

El tercer parámetro de esta función se llama “fn” y es de tipo función. Cuando un parámetro es de tipo función debemos indicar los parámetros que tiene dicha función (en este caso tiene dos parámetros enteros) y luego del operador -> el tipo de dato que retorna esta función:

```
fn: (Int, Int) -> Int
```

Cuando tengamos una función como parámetro que no retorne dato se indica el tipo Unit, por ejemplo:

```
fn: (Int, Int) -> Unit
```

El algoritmo de la función operar consiste en llamar a la función fn y pasar los dos enteros que espera dicha función:

```
return fn(v1, v2)
```

Como la función operar retorna un entero debemos indicar con la palabra clave return que devuelva el dato que retorna la función “fn”.

Las cuatro funciones que calculan la suma, resta, multiplicación y división no tienen nada nuevo a lo visto en conceptos anteriores:

```
funsumar(x1: Int, x2: Int) = x1 + x2

funrestar(x1: Int, x2: Int) = x1 - x2

funmultiplicar(x1: Int, x2: Int) = x1 * x2

fundividir(x1: Int, x2: Int) = x1 / x2
```

En la función main llamamos a la función operar y le pasamos tres datos, dos enteros y uno con la referencia de una función:

```
val resu1 = operar(10, 5, ::sumar)
```

Como vemos para pasar la referencia de una función antecedemos el operador ::
La función operar retorna un entero y lo almacenamos en la variable resu1 que mostramos luego por pantalla:

```
println("La suma de 10 y 5 es $resu1")
```

Es importante imaginar el funcionamiento de la función operar que recibe tres datos y utiliza uno de ellos para llamar a otra función que retorna un valor y que luego este valor lo retorna operar y llega finalmente a la variable “resu1”.

Llamamos a operar y le pasamos nuevamente la referencia a la función sumar:

```
val resu2 = operar(5, 2, ::sumar)
println("La suma de 5 y 2 es $resu2")
```

De forma similar llamamos a operar y le pasamos las referencias a las otras funciones:

```
println("La resta de 100 y 40 es ${operar(100, 40, ::restar)}")
println("El producto entre 5 y 20 es ${operar(5, 20, ::multiplicar)}")
println("La división entre 10 y 5 es ${operar(10, 5, ::dividir)}")
```

Tener en cuenta que para sumar dos enteros es mejor llamar directamente a la función sumar y pasar los dos enteros, pero el objetivo de este problema es conocer la sintaxis de las funciones de orden superior presentando el problema más sencillo.

Las funciones de orden superior se pueden utilizar perfectamente en los métodos de una clase.

***Problema 2***

Declarar una clase que almacene el nombre y la edad de una persona. Definir un método que retorne true o false según si la persona es mayor de edad o no. Esta función debe recibir como parámetro una función que al llamarla pasando la edad de la persona retornara si es mayor o no de edad.
Tener en cuenta que una persona es mayor de edad en Estados Unidos si tiene 21 o más años y en Argentina si tiene 18 o más años.

```
class Persona(val nombre: String, val edad: Int) {
funesMayor(fn:(Int) -> Boolean): Boolean {
return fn(edad)
}
}

fun mayorEstadosUnidos(edad: Int): Boolean {
if (edad >= 21)
returntrue
else
returnfalse
}

fun mayorArgentina(edad: Int): Boolean {
if (edad >= 18)
returntrue
else
returnfalse
}

fun main(parametro: Array<String>) {
val persona1 = Persona("juan", 18)
if (persona1.esMayor(::mayorArgentina))
println("${persona1.nombre} es mayor si vive en Argentina")
else
println("${persona1.nombre} no es mayor si vive en Argentina")
if (persona1.esMayor(::mayorEstadosUnidos))
println("${persona1.nombre} es mayor si vive en Estados Unidos")
else
println("${persona1.nombre} no es mayor si vive en Estados Unidos")
}
```

Declaramos la clase Persona con dos propiedades llamadas nombre y edad:

```
classPersona(valnombre: String, valedad: Int) {
```

La clase persona por si misma no guarda la nacionalidad de la persona, en cambio cuando se pregunta si es mayor de edad se le pasa como referencia una función que al pasar la edad nos retorna true o false:

```
fun esMayor(fn:(Int) -> Boolean): Boolean {
return fn(edad)
}
```

Tenemos dos funciones que al pasar una edad nos retornan si es mayor de edad o no:

```
funmayorEstadosUnidos(edad: Int): Boolean {
if (edad >= 21)
returntrue
else
returnfalse
}

funmayorArgentina(edad: Int): Boolean {
if (edad >= 18)
returntrue
else
returnfalse
}
```

En la función main creamos un objeto de la clase persona:

```
val persona1 = Persona("juan", 18)
```

Llamamos al método esMayor del objeto persona1 y le pasamos la referencia de la función “mayorArgentina”:

```
if (persona1.esMayor(::mayorArgentina))
println("${persona1.nombre} es mayor si vive en Argentina")
else
println("${persona1.nombre} no es mayor si vive en Argentina")
```

Ahora llamamos al método esMayor pero pasando la referencia de la función “mayorEstadosUnidos”:

```
if (persona1.esMayor(::mayorEstadosUnidos))
println("${persona1.nombre} es mayor si vive en Estados Unidos")
else
println("${persona1.nombre} no es mayor si vive en Estados Unidos")
```

Como podemos comprobar el concepto de funciones de orden superior es aplicable a los métodos de una clase.

No hicimos un código más conciso con el objeto que quede más claro la sintaxis de funciones de orden superior, pero el mismo problema puede ser:

```
classPersona(val nombre: String, val edad: Int) {
funesMayor(fn:(Int) -> Boolean) = fn(edad)
}

funmayorEstadosUnidos(edad: Int) = if (edad >= 21) trueelsefalse

funmayorArgentina(edad: Int) = if (edad >= 18) trueelsefalse

funmain(parametro: Array<String>) {
val persona1 = Persona("juan", 18)
if (persona1.esMayor(::mayorArgentina))
println("${persona1.nombre} es mayor si vive en Argentina")
else
println("${persona1.nombre} no es mayor si vive en Argentina")
if (persona1.esMayor(::mayorEstadosUnidos))
println("${persona1.nombre} es mayor si vive en Estados Unidos")
else
println("${persona1.nombre} no es mayor si vive en Estados Unidos")
}
```