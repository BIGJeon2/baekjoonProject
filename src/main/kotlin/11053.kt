package org.example

import kotlin.math.max

fun BaekJoon_11053() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val inputArr = readLine().split(" ").map { it.toInt() }
    val dp = IntArray(n){1}
    for (i in 0 until n) {
        for (j in 0 until i) {
            if (inputArr[i] > inputArr[j]) {
                dp[i] = max(dp[i], dp[j] + 1)
            }
        }
    }
    print(dp.max())
}