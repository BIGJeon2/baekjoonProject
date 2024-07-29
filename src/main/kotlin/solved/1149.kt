package org.example.solved

import kotlin.math.min

fun BaekJoon_1149() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val homeArr = Array(n){IntArray(3) }
    for (i in 0 until n){
        homeArr[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
    }
    for (i in 1 until n){
        homeArr[i][0] += min(homeArr[i-1][1], homeArr[i-1][2])
        homeArr[i][1] += min(homeArr[i-1][0], homeArr[i-1][2])
        homeArr[i][2] += min(homeArr[i-1][0], homeArr[i-1][1])
    }

    print(minOf(homeArr[n-1][0], homeArr[n-1][1], homeArr[n-1][2]))
}