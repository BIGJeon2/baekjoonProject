package org.example.solved

import kotlin.Long.Companion.MAX_VALUE
import kotlin.math.min

fun BaekJoon_11049() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val inputArr = Array(n+1){(LongArray(2))}
    val dp = Array(n+1) {LongArray(n+1)}

    for (i in 1 ..n){
        val longArr = readLine().split(" ").map { it.toLong() }.toLongArray()
        inputArr[i]= longArr
    }

    for (i in 2..n) {
        for (j in i-1 downTo 1) {
            dp[j][i] = MAX_VALUE
            for (k in j until  i) {
                val result = inputArr[j][0] * inputArr[k][1] * inputArr[i][1]
                println("i = ${i} :: j = ${j} :: k = ${k}")
                dp[j][i] = min(dp[j][i], dp[j][k] + dp[k+1][i] + result)
            }
        }
    }

    print(dp[1][n])
}