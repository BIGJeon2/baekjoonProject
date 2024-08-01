package org.example.solved

import java.io.BufferedWriter
import java.io.OutputStreamWriter

val answer = BufferedWriter(OutputStreamWriter(System.out))

fun BaekJoon_1992() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val graph = Array(n){readLine()}

    dfs(0,0,n,graph)
    answer.flush()
    answer.close()
}

fun dfs(r : Int, c : Int, size : Int, graph : Array<String>){
    var zero = true
    var one = true

    for(i in r until r+size){
        for(j in c until c+size){
            if(graph[i][j] == '0') one = false
            else zero = false
        }
    }
    if(zero){
        answer.write("0")
    }
    if(one){
        answer.write("1")
    }

    if (!zero && !one){
        answer.write("(")
        dfs(r,c,size/2,graph)
        dfs(r,c+size/2,size/2,graph)
        dfs(r+size/2,c,size/2,graph)
        dfs(r+size/2,c+size/2,size/2,graph)
        answer.write(")")
    }
}