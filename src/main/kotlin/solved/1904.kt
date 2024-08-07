package org.example.solved

fun BaekJoon_1904() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    var n1 = 1
    var n2 = 2

    for (i in 0 until n - 2) {
        val temp = n1
        n1 = n2
        n2 = (temp + n2) % 15746
    }

    println(if (n == 1) 1 else n2)
}