package org.example.solved

import java.util.Stack

fun BaekJoon_3015() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val stack = Stack<map>()
    var count = 0L

    repeat(n){
        val num = map(readLine().toInt(), 1)
        while (stack.isNotEmpty() && stack.peek().heigt <= num.heigt){
            val popMap = stack.pop()
            count += popMap.cnt
            if (popMap.heigt == num.heigt) num.cnt += popMap.cnt
        }
        if (stack.isNotEmpty()) {
            count++
        }
        stack.push(num)
    }

    print("$count")
}

data class map(
    val heigt: Int,
    var cnt: Int
)