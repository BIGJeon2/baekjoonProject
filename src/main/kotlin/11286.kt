package org.example

import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.PriorityQueue
import kotlin.math.abs

fun BaekJoon_11286() = with(System.`in`.bufferedReader())  {
    val answer = BufferedWriter(OutputStreamWriter(System.out))
    val arr = PriorityQueue<Int>{ x1, x2 -> if (abs(x1) == abs(x2)) x1 - x2 else abs(x1) - abs(x2)}
    repeat(readLine().toInt()){
        when(val input = readLine().toInt()){
            0 -> if (arr.isEmpty()) answer.write("0\n") else answer.write("${arr.poll()}\n")
            else -> arr.offer(input)
        }
    }
    answer.flush()
    answer.close()
}