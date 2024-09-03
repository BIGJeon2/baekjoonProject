package org.example

import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val numList = readLine().split(" ").map { it.toInt() }.toIntArray()
    val stack = Stack<Int>()
    val sb = StringBuilder()

    for (i in 0 until n){
        while(stack.isNotEmpty() && numList[stack.peek()] < numList[i]){
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