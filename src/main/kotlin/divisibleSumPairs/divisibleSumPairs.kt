package divisibleSumPairs


import kotlin.io.*
import kotlin.ranges.*


/*
 * Complete the 'divisibleSumPairs' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 *  3. INTEGER_ARRAY ar
 */

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var count : Int = 0
    var sum : Int

    for (i in 0 until n) {
        for (j in i+1 until n) {
            sum = ar[i] + ar[j]
            if (sum % k == 0) {
                count += 1
            }
            sum = 0
        }
    }

    return count

}

fun main(args: Array<String>) {
    val n = 6

    val k = 3

    val ar = arrayOf<Int>(1, 3, 2, 6, 1, 2)

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}
