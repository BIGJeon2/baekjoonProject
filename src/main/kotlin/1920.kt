package org.example

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun BaekJoon_1920() = with(System.`in`.bufferedReader())  {
    val answer = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val cardArray = readLine().split(" ").map { it.toInt() }
    val m = readLine().toInt()
    val numArray = readLine().split(" ").map { it.toInt() }
    val result = HashMap<Int, Int>()

    repeat(n){
        result[cardArray[it]] = result.getOrDefault(cardArray[it], 1)
    }

    repeat(m){
        answer.write("${result[numArray[it]] ?: 0}\n")
    }

    answer.flush()
    answer.close()
}