package org.example

import kotlin.collections.ArrayDeque

fun main() = with(System.`in`.bufferedReader()) {
    readLine().toInt()
    val numArr = readLine().split(" ").map { it.toInt() }
    val stackArr = ArrayDeque<Int>()
    var curNumber = 1
    for (num in numArr) {
        if (num == curNumber) {
            curNumber++
            while (stackArr.isNotEmpty() && stackArr.last() == curNumber) {
                stackArr.removeLast()
                curNumber++
            }
        } else {
            stackArr.addLast(num)
        }
    }
    println(if (stackArr.isEmpty()) "Nice" else "Sad")
}