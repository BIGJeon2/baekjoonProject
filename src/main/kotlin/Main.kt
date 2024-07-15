package org.example

import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = readLine().split(" ").map { it.toInt() }
    val dp = Array(n){ 0 }

    dp[0] = arr[0]
    var maximum = arr[0]

    for (i in 1 until n){
        dp[i] = max(dp[i-1] + arr[i], arr[i])
        maximum = max(maximum, dp[i])
    }

    print(maximum)

}