package org.example.solved

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun BaekJoon_11659() = with(System.`in`.bufferedReader()) {
    val answer = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numList = mutableListOf<Int>()
    numList.add(0)
    readLine().split(" ").map { it.toInt() }.forEach {
        numList.add(it)
    }
    for (i in 1 .. n){
        numList[i] = numList[i] + numList[i - 1]
    }

    repeat(m){
        val (start, end) = readLine().split(" ").map { it.toInt() }
        answer.write("${numList[end] - numList[start-1]}\n")
    }
    answer.flush()
    answer.close()
}