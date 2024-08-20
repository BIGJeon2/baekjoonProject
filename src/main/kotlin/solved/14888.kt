package org.example.solved

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

fun BaekJoon_14888() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val numList = readLine().split(" ").map { it.toInt() }.toIntArray()
    val operatorList = readLine().split(" ").map { it.toInt() }.toIntArray() // [0] : +, [0] : -, [0] : *, [0] : /
    var max = -1000000000
    var min = 1000000000

    fun calculateDFS(idx: Int, num: Int) {
        if (idx == n){
            max = max(max, num)
            min = min(min, num)
        }

        for (i in operatorList.indices){
            if (operatorList[i] != 0){
                operatorList[i]--
                when(i){
                    0 -> calculateDFS(idx + 1, num + numList[idx])
                    1 -> calculateDFS(idx + 1, num - numList[idx])
                    2 -> calculateDFS(idx + 1, num * numList[idx])
                    else -> {
                        if (num < 0) calculateDFS(idx + 1, -(abs(num) / numList[idx]))
                        else calculateDFS(idx + 1, num / numList[idx])
                    }
                }
                operatorList[i]++
            }
        }
    }

    calculateDFS(1, numList[0])
    println(max)
    println(min)
}