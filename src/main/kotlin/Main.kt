package org.example

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val stack = Stack<Int>()
    val sb = StringBuilder()
    repeat(readLine().toInt()){
        val command = StringTokenizer(readLine())
        when(command.nextToken().toInt()){
            1 -> stack.push(command.nextToken().toInt())
            2 -> sb.append(if(stack.isEmpty()) -1 else stack.pop()).append("\n")
            3 -> sb.append(stack.size).append("\n")
            4 -> sb.append(if(stack.isEmpty()) 1 else 0).append("\n")
            5 -> sb.append(if(stack.isEmpty()) -1 else stack.peek()).append("\n")
            else -> throw IllegalArgumentException()
        }
    }
    print(sb)
}