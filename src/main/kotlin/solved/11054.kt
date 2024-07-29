package org.example.solved

import kotlin.math.max

fun BaekJoon_11054() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val inputArr = readLine().split(" ").map { it.toInt() }
    val dpASC = IntArray(n){1}
    val dpDESC  = IntArray(n){1}
    val result = IntArray(n){0}
    for (i in 0 until n) {
        for (j in 0 until i) {
            if (inputArr[i] > inputArr[j]) {
                dpASC[i] = max(dpASC[i], dpASC[j] + 1)
            }
        }
    }

    val reverseInputArr = inputArr.reversed()

    for (i in 0 until n) {
        for (j in 0 until i) {
            if (reverseInputArr[i] > reverseInputArr[j]) {
                dpDESC[i] = max(dpDESC[i], dpDESC[j] + 1)
            }
        }
    }

    dpDESC.reverse()

    for (i in dpASC.indices){
        result[i] = dpASC[i] + dpDESC[i]
    }

    print(result.maxOrNull()?.minus(1)?:0)
}