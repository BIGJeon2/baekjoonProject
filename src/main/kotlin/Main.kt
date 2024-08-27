package org.example

import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(" ").map { it.toInt() }
    val board = Array(n){CharArray(m)}
    val MAX = k*k
    var answer = k*k

    repeat(n){
        board[it] = readLine().toCharArray()
    }



    fun checkColor(newBoard: Array<CharArray>) {
        var count = 0
        for (i in 0 until k){
            for (j in 0 until k){
                when(i % 2){
                    0 -> {
                        when(j % 2){
                            0 -> {
                                if (newBoard[i][j] != 'B') count++
                            }
                            1 -> {
                                if (newBoard[i][j] == 'B') count++
                            }
                        }
                    }
                    1 -> {
                        when(j % 2){
                            0 -> {
                                if (newBoard[i][j] == 'B') count++
                            }
                            1 -> {
                                if (newBoard[i][j] != 'B') count++
                            }
                        }
                    }
                }
            }
        }
        //answer = min(answer, count)
        answer = min(answer, min(MAX - count, count))
    }

    fun getChessBoard(x: Int, y: Int) {
        val newBoard = Array(k){CharArray(k)}
        for (i in x until  x + k){
            for (j in y until  y + k){
                newBoard[i-x][j-y] = board[i][j]
            }
        }
        checkColor(newBoard)
    }

    for (i in 0 .. n - k){
        for (j in 0 .. m - k){
            getChessBoard(i,j)
        }
    }

    print(answer)

}