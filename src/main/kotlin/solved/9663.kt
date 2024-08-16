package org.example.solved

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

var n = BufferedReader(InputStreamReader(System.`in`)).readLine().toInt()
var answer = 0
val chessBoard = Array(15){0}

fun BaekJoon_9663() {
    chessDFS(0)
    print(answer)
}

private fun chessDFS(r: Int){
    if (r == n){
        answer++
    }else{
        for (i in 0 until n){ //행
            chessBoard[r] = i
            if (checkChess(r)) chessDFS(r + 1)
        }
    }
}

private fun checkChess(y: Int): Boolean{
    for (i in 0 until y){ //열
        if (chessBoard[y] == chessBoard[i] || abs(chessBoard[y] - chessBoard[i]) == y - i) return false
    }
    return true
}