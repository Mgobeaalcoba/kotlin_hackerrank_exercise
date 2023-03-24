package vowelSubstring

import java.io.*

import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*



/*
 * Complete the 'findSubstring' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. INTEGER k
 */

fun findSubstring(s: String, k: Int): String {

    var ini : Int = 0
    var fin : Int = k
    var count : Int = 0
    var maxCount : Int = 0
    var subString : String = ""

    while (ini <= (s.length - k)) {
        for (i in ini until fin) {
            when (s.get(i).toString()) {
                "a", "e", "i", "o", "u" -> ++count
            }
            println("Palabra que pasó por el ciclo for: " + s.substring(ini, fin))
        }
        if (count > maxCount) {
            maxCount = count
            subString =  s.substring(ini,fin)
            println("Palabrá que se registró en la iteración while: " + subString)
            println("maxCount registrado en la iteración while: " + maxCount)
        }
        ++ini
        ++fin
        count = 0
    }
    if (maxCount == 0) {
        subString = "Not found!"
    }
    println("maxCount: " + maxCount)
    println("subString: " + subString)
    return subString
}

fun main(args: Array<String>) {
    val s = "caberqiitefg"

    val k = 5

    val result = findSubstring(s, k)

    println(result)
}