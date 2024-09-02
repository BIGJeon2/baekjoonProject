package org.example.solved

import java.util.Stack

fun BaekJoon_9935() = with(System.`in`.bufferedReader()) {
    val inputStr = readLine()
    val targetStr = readLine()
    val stack = Stack<Char>()
    for (i in inputStr){
        stack.push(i)
        if (stack.size >= targetStr.length) {
            var isBoom = true
            for (j in targetStr.indices){
                if (stack[stack.size - targetStr.length + j] != targetStr[j]){
                    isBoom = false
                    break
                }
            }
            if (isBoom) {
                repeat(targetStr.length){
                    stack.pop()
                }
            }
        }
    }

    val sb = StringBuilder()

    if (stack.isEmpty()) print("FRULA")
    else {
        stack.forEach { sb.append(it) }
        print(sb.toString())
    }
}