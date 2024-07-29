package org.example.solved

import kotlin.Long.Companion.MAX_VALUE
import kotlin.math.min

fun BaekJoon_11066() = with(System.`in`.bufferedReader())  {
    repeat(readLine().toInt()){
        val n = readLine().toInt()
        val inputArr = readLine().split(" ").map { it.toInt() }
        val dp = Array(n+1) {LongArray(n+1)}
        val sumArr = LongArray(n+1)

        for (i in 1..n){
            sumArr[i] = sumArr[i-1] + inputArr[i-1]
        }

        for (i in 1..n) {
            for (j in 1..n - i) {
                dp[j][j + i] = MAX_VALUE
                for (k in j until j + i) {
                    dp[j][j + i] = min(dp[j][j + i], dp[j][k] + dp[k + 1][j + i] + sumArr[j + i] - sumArr[j - 1])
                }
            }
        }

        println(dp[1][n])
    }
}