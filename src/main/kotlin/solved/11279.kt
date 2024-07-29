package org.example.solved

import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.Collections
import java.util.PriorityQueue

fun BaekJoon_11279() = with(System.`in`.bufferedReader())  {
    val answer = BufferedWriter(OutputStreamWriter(System.out))
    val arr = PriorityQueue<Int>(Collections.reverseOrder())
    repeat(readLine().toInt()){
        when(val input = readLine().toInt()){
            0 -> if (arr.isEmpty()) answer.write("0\n") else answer.write("${arr.poll()}\n")
            else -> arr.offer(input)
        }
    }
    answer.flush()
    answer.close()
}