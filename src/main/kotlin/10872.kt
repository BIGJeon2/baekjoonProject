package org.example

fun BaekJoon_10872() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val n = readLine().toInt()
    var result = 1L
    for(i in 1 .. n) {
        result = result * i
    }
    sb.append(result)
    print(sb)
}