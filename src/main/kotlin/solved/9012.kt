package org.example.solved

fun BaekJoon_9012() = with(System.`in`.bufferedReader()) {
    repeat(readLine().toInt()) {
        if (check(readLine().split(""))) println("YES") else println("NO")
    }
}

fun check(inputArr: List<String>): Boolean{
    var openCount = 0
    for (i in inputArr){
        when(i){
            "(" -> openCount++
            ")" -> if (openCount == 0) return false else openCount--
        }
    }
    return openCount <= 0
}