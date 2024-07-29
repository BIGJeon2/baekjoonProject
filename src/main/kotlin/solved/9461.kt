package org.example.solved

fun BaekJoon_9461() = with(System.`in`.bufferedReader()) {
    val resultArr = LongArray(101){ 0L }
    resultArr[1] = 1
    resultArr[2] = 1
    for (i in 3..100){
        resultArr[i] = resultArr[i - 2] + resultArr[i - 3]
    }

    repeat(readLine().toInt()){
        println(resultArr[readLine().toInt()])
    }
}