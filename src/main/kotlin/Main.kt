package org.example

import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    sb.append((2.0).pow(Integer.parseInt(readLine())).toInt())
    print(sb)
}