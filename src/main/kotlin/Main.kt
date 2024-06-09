package org.example

import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val (n, m) = readLine().split(" ").map { it.toInt() }
    var result = 1L
    for(i in 1 .. m) {
        result = result * (n - i + 1) / i
    }
    sb.append(result)
    print(sb)
}