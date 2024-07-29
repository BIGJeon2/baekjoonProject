package org.example.solved

import kotlin.math.pow

fun BaekJoon_24723() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    sb.append((2.0).pow(Integer.parseInt(readLine())).toInt())
    print(sb)
}