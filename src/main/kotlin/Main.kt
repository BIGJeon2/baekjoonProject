package org.example

import kotlin.math.pow

val sb = StringBuilder()

fun main() = with(System.`in`.bufferedReader())  {
    val input = readLine().toInt()
    for(i in 0 until input){
        for (j in 0 until input){
            star(input, i, j)
        }
        sb.append("\n")
    }

    print(sb)
}
fun star(total: Int, col: Int, row: Int){
    if ((col / total) % 3 == 1 && (row / total) % 3 == 1){
        sb.append(" ")
    }else if (total / 3 == 0){
        sb.append("*")
    }else{
        star(total/3, row, col)
    }
}