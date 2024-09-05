package org.example.solved

import java.util.Stack
import kotlin.math.max

fun BaekJoon_1725() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val numList = IntArray(n+2)
    val stack = Stack<Int>()
    var num: Int
    var answer = 0
    stack.push(0)

    for (i in 1 .. n+1){
        if (i == n + 1) num = 0
        else num = readLine().toInt()
        numList[i] = num
        while(stack.isNotEmpty() && numList[stack.peek()] > num){
            val idx = stack.pop()
            answer = max(answer, numList[idx] * (i - stack.peek() - 1))
        }
        stack.push(i)
    }

    print(answer)
}