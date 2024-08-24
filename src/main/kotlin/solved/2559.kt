package org.example.solved

import kotlin.math.max

fun BaekJoon_2559() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numList = readLine().split(" ").map { it.toInt() }.toIntArray()
    for (i in 1 until n){
        numList[i] = numList[i-1] + numList[i]
    }
    var MAX = numList[m-1]
    for (i in 0 until n - m){
        MAX = max(MAX, numList[i+m]-numList[i])
    }
    print(MAX)
}