package org.example.solved

import java.util.*

fun BaekJoon_10773() = with(System.`in`.bufferedReader())  {
    val n = readLine().toInt()
    val arr = Stack<Long>()
    repeat(n){
        when(val input = readLine().toLong()){
            0L -> arr.pop()
            else -> arr.add(input)
        }
    }
    println(arr.sum())
}