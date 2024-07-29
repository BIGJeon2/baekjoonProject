package org.example.solved

fun BaekJoon_11050() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val (n, m) = readLine().split(" ").map { it.toInt() }
    var result = 1L
    for(i in 1 .. m) {
        result = result * (n - i + 1) / i
    }
    sb.append(result)
    print(sb)
}