package org.example.solved

import kotlin.math.pow

fun BaekJoon_11729() = with(System.`in`.bufferedReader())  {
    val sb = StringBuilder()
    val topCount = readLine().toInt()
    sb.append("${2.0.pow(topCount).toInt() - 1} \n")

    fun hanoi(num : Int, start: Int, sub: Int, end: Int){
        if (num == 0) return
        hanoi(num - 1, start, end, sub)
        sb.append("$start $end \n")
        hanoi(num - 1, sub, start, end)
    }

    hanoi(topCount, 1, 2, 3)
    print(sb)
}