package org.example.solved

import kotlin.math.max

fun BaekJoon_12865() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().toString().split(" ").map { it.toInt() }
    val weightArr = IntArray(n + 1)
    val qualityArr = IntArray(n + 1)
    val dp = Array(n + 1) { Array(m + 1) { 0 } }

    repeat(n) {
        val (weight, quality) = readLine().toString().split(" ").map { it.toInt() }
        weightArr[it + 1] = weight
        qualityArr[it + 1] = quality
    }

    for (i in 1..n) {
        for (j in 1 .. m) {
            if (weightArr[i] > j) {
                dp[i][j] = dp[i - 1][j]
            }else{
                dp[i][j] = max(qualityArr[i] + dp[i-1][j - weightArr[i]], dp[i-1][j])
            }
        }
    }
    print(dp[n][m])
}