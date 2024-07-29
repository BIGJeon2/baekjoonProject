package org.example.solved

import kotlin.math.max

fun BaekJoon_9251() = with(System.`in`.bufferedReader()) {
    val firstCharArr = readLine().toString().toCharArray()
    val secondCharArr = readLine().toString().toCharArray()
    val dp = Array(firstCharArr.size + 1){ Array(secondCharArr.size + 1){0} }

    for (i in firstCharArr.indices){
        for (j in secondCharArr.indices){
            if (firstCharArr[i] != secondCharArr[j]){
                dp[i + 1][j + 1] = max(dp[i][j + 1], dp[i + 1][j])
            }else{
                dp[i + 1][j + 1] = dp[i][j] + 1
            }
        }
    }

    print("${dp[firstCharArr.size][secondCharArr.size]}")

}