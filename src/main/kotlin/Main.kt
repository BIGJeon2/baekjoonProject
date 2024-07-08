package org.example

import kotlin.Long.Companion.MAX_VALUE
import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) {
    val (n,m) = readLine().split(" ").map { it.toInt() }
    val inputArr = Array(n){LongArray(m)}
    var result = n * (m-1)
    var count = 0

    for (i in 0 until n){
        val longArr = readLine().split(" ").map { it.toLong() }.toLongArray()
        inputArr[i]= longArr
    }

    for (i in 0 until n){
        for (j in 0 until m){
            val value = inputArr[i][j]
            if (i != n - 1 && j != m - 1){
                if (value >= inputArr[i][j+1] || value >= inputArr[i+1][j]){
                    result--
                }
            }else if (i == n - 1 && j != m - 1){
                if (value >= inputArr[i][j+1]){
                    result--
                }
            }else if (i != n - 1 && j == m - 1){
                if (value >= inputArr[i+1][j]){
                    result--
                }
            }
        }
    }
    print(result)
    print(count)
    /*for (i in 2..n) {
        for (j in i-1 downTo 1) {
            dp[j][i] = MAX_VALUE
            for (k in j until  i) {
                val result = inputArr[j][0] * inputArr[k][1] * inputArr[i][1]
                println("i = ${i} :: j = ${j} :: k = ${k}")
                dp[j][i] = min(dp[j][i], dp[j][k] + dp[k+1][i] + result)
            }
        }
    }

    */
}