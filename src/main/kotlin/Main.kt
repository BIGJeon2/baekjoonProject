package org.example

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val colorCount = Integer.parseInt(readLine())
    val sb = StringBuilder()
    sb.append(colorCount * (colorCount-1)).append("\n")
    print(sb)
}