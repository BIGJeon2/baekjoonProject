package org.example.solved

import java.util.*

fun BaekJoon_18258() = with(System.`in`.bufferedReader()) {
    val queue = LinkedList<Int>()
    val sb = StringBuilder()
    repeat(readLine().toInt()){
        val command = StringTokenizer(readLine())
        when(command.nextToken().toString()){
            "push" -> queue.add(command.nextToken().toInt())
            "pop" -> sb.append(if(queue.isEmpty()) -1 else queue.pop()).append("\n")
            "size" -> sb.append(queue.size).append("\n")
            "empty" -> sb.append(if(queue.isEmpty()) 1 else 0).append("\n")
            "front" -> sb.append(if(queue.isEmpty()) -1 else queue.first).append("\n")
            "back" -> sb.append(if(queue.isEmpty()) -1 else queue.last).append("\n")
            else -> throw IllegalArgumentException()
        }
    }
    print(sb)
}