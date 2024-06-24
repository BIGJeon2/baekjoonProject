package org.example

import kotlin.math.max

fun main() = with(System.`in`.bufferedReader())  {
    val arraySize = readLine().toInt()
    val outPutIndex = readLine().toInt()
    val numList = mutableListOf<Int>()

    for (i in 1 .. arraySize){
        for (j in 1 .. arraySize){
            numList.add(i*j)
        }
    }

    numList.sort()

    println(numList[outPutIndex-1])

}