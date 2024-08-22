package org.example.solved

fun BaekJoon_11399() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val numList = readLine().split(" ").map { it.toInt() }.toIntArray()
    var time = 0

    numList.sort()

    for (i in 0 until n){
        time += numList[i] * (n - i)
    }

    print(time)
}