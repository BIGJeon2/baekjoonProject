package org.example.solved

import java.util.Stack

fun BaekJoon_17299() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val numList = readLine().split(" ").map { it.toInt() }.toIntArray()
    val countList = IntArray(1000001){0}
    val stack = Stack<Int>()
    val sb = StringBuilder()

    for (i in numList){
        countList[i] += 1
    }

    for (i in 0 until n){
        while(stack.isNotEmpty() && countList[numList[stack.peek()]] < countList[numList[i]]){
            numList[stack.pop()] = numList[i]
        }
        stack.push(i)
    }

    while (stack.isNotEmpty()){
        numList[stack.pop()] = -1
    }

    for (i in numList){
        sb.append("$i ")
    }
    print(sb)
}