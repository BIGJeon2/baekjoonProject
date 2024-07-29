package org.example.solved

import kotlin.math.max

fun BaekJoon_2156() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val inputArr = IntArray(n + 1){0}
    val dp = IntArray(n + 1){0}

    repeat(n){
        inputArr[it + 1] = readLine().toInt()
    }

    for (i in 1..n){
        when(i){
            1 -> dp[i] = inputArr[1]
            2 -> dp[i] = inputArr[2] + inputArr[1]
            else -> {
                dp[i] = max(max(inputArr[i] + dp[i - 2], dp[i-1]), inputArr[i] + inputArr[i - 1] + dp[i - 3])
            }
        }
    }

    println(dp[n])
}