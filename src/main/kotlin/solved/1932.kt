package org.example.solved

import kotlin.math.max

fun BaekJoon_1932() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var resultArr = IntArray(1){readLine().toInt()}
    for (i in 1 until n){
        val inputArr = readLine().split(" ").map { it.toInt() }.toIntArray()
        val newArr = IntArray(inputArr.size){0}
        for (i in inputArr.indices){
            if (i == 0){
                newArr[0] = inputArr[0] + resultArr[0]
            }else if (i == inputArr.lastIndex){
                newArr[newArr.size-1] = inputArr.last() + resultArr.last()
            }else{
                newArr[i] = max(inputArr[i] + resultArr[i - 1], inputArr[i] + resultArr[i])
            }
        }
        resultArr = newArr
    }
    print(resultArr.max())
}