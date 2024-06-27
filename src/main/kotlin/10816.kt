package org.example

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun BaekJoon_10816() = with(System.`in`.bufferedReader())  {
    val answer = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val cardArray = readLine().split(" ").map { it.toInt() }
    val m = readLine().toInt()
    val numArray = readLine().split(" ").map { it.toInt() }
    val result = HashMap<Int, Int>()

    repeat(n){
        result[cardArray[it]] = result.getOrDefault(cardArray[it], 0) + 1
    }

    repeat(m){
        answer.write("${result[numArray[it]] ?: 0} ")
    }

    answer.flush()
    answer.close()
}