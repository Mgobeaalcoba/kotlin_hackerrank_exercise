## Tipos de funciones en Kotlin

**Declarando funciones**

Las funciones se declaran usando la palabra clave fun, seguida del nombre del método, los paréntesis donde declararemos los valores de entrada y unas llaves que limitan la función.


```
fun main(args: Array<String>) {
    showMyName()
    showMyLastName()
    showMyAge()
}
fun showMyName(){ 
    println("Me llamo Aris")      
}
fun showMyLastName(){
    println("Mi Apellido es Guimerá")
}
fun showMyAge(){ 
    println("Tengo 24 años")       
}
```  

Si os fijáis en el código anterior, tenemos 4 métodos. 3 de ellos están destinados para una sola función (mostrar nombre, edad y apellidos) pero no se ejecutarán a no ser que sean llamados. Por ello el cuarto método que es el que se ejecutar el código, los llamará en el orden que le pongamos. Dándonos un resultado así.

**Funciones con parámetros de entrada**

Ahora vamos a ver las funciones con parámetros de entrada, que son iguales, pero al llamarlas habrá que mandarle las variables que necesite.

```
fun main(args: Array<String>) {
    showMyInformation("Aris", "Guimerá", 24)
}
fun showMyInformation(name: String, lastName: String, age: Int){
    println("Me llamo $name $lastName y tengo $age años.")
}
```

Como se puede observar, tiene tres parámetros de entrada, la forma de declararlos es muy fácil el nombre de la variable, seguida de dos puntos y el tipo de variable, aquí si es obligatorio definir el tipo.

Obviamente al llamar al método podemos pasarle variables recuperadas de otros métodos y demás.

**Funciones con parámetros de salida**

Nos queda por ver como una función puede devolver un resultado o lo que haga nuestro método. La única limitación es que solo se puede devolver un parámetro, aunque para eso tenemos los métodos (ya lo veremos más tarde).

```
fun main(args: Array<String>) {
    var result = add(5, 10)
    println(result)
}
fun add(firsNumber: Int, secondNumber: Int) : Int{
    return firsNumber + secondNumber
}
```

Como el ejemplo anterior añadimos los parámetros de entrada pero esta vez, al cerrar los paréntesis pondremos el tipo de variable que debe devolver nuestra función. Luego la función hará todo lo que tenga que hacer y cuando tenga el resultado, lo devolveremos con la palabra clave return.

Si el método es muy fácil, podemos evitar las llaves y simplificar la función un poco más.

```
fun add(firsNumber: Int, secondNumber: Int) : Int = firsNumber + secondNumber
```

**Función que devuelve Unit de forma implicita**

Las funciones en Kotlin SIEMPRE devuelven algo. Las que no lo declaran de forma explicita lo devuelven de forma implicita y es de tipo Unit

```  
fun imprimirNombre(nombre: String, apellido: String) {
    print("Mi nombre es $nombre y mi apellido es $apellido)
}
```  