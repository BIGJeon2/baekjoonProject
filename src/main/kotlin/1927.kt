package org.example

import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.PriorityQueue

fun BaekJoon_1927() = with(System.`in`.bufferedReader())  {
    val answer = BufferedWriter(OutputStreamWriter(System.out))
    val arr = PriorityQueue<Int>()
    repeat(readLine().toInt()){
        when(val input = readLine().toInt()){
            0 -> if (arr.isEmpty()) answer.write("0\n") else answer.write("${arr.poll()}\n")
            else -> arr.offer(input)
        }
    }
    answer.flush()
    answer.close()
}