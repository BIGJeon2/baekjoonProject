package org.example.solved

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun BaekJoon_16139() = with(System.`in`.bufferedReader()) {
    val answer = BufferedWriter(OutputStreamWriter(System.out))
    val str = readLine().toString()
    val countList = Array(26){IntArray(str.length){0}}
    val n = readLine().toInt()

    countList[str[0].code-97][0] = 1

    for (i in 1 until  str.length){
        val codeNum = str[i].code - 97
        for (j in 0 until 26){
            countList[j][i] = countList[j][i-1]
        }
        countList[codeNum][i] ++
    }

    repeat(n){
        val (text,start,end) = readLine().split(" ")
        val codeNum = text.first().code - 97
        if (start.toInt() == 0) answer.write("${countList[codeNum][end.toInt()]}\n")
        else answer.write("${countList[codeNum][end.toInt()] - countList[codeNum][start.toInt() - 1]}\n")
    }

    answer.flush()
    answer.close()
}