package org.example.solved

import java.util.*

fun BaekJoon_24511() = with(System.`in`.bufferedReader())  {
    val sb = StringBuilder()
    readLine().toInt()
    val arrayType = readLine().split(" ").map { it.toInt() }
    val firstSetArray = readLine().split(" ").map { it.toInt() }
    val outPut = LinkedList<Int>()
    for (i in arrayType.indices){
        if (arrayType[i] == 0){
            outPut.push(firstSetArray[i])
        }
    }
    readLine().toInt()
    val newInputDataArray = readLine().split(" ").map { it.toInt() }
    for (i in newInputDataArray){
        outPut.addLast(i)
        sb.append(outPut.pop()).append(" ")
    }
    println(sb.append("\n"))
}