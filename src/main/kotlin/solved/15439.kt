package org.example.solved

fun BaekJoon_15439() = with(System.`in`.bufferedReader()) {
    val colorCount = Integer.parseInt(readLine())
    val sb = StringBuilder()
    sb.append(colorCount * (colorCount-1)).append("\n")
    print(sb)
}