package org.example.solved

import kotlin.math.max

fun BaekJoon_2565() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val inputArr = Array(n){IntArray(2)}
    val dp = Array(n){ 1 }
    repeat(n){ it ->
        inputArr[it] = readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    //정렬
    inputArr.sortWith(comparator = {a, b ->
        a[0] - b[0]
    })


    for (i in 1 until n){
        for (j in 0 until i){
            if (inputArr[i][1] > inputArr[j][1]){
                dp[i] = max(dp[i],dp[j] + 1)
            }
        }
    }

    print("${n - dp.max()}")
}