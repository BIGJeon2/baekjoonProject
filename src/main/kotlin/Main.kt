package org.example

var answer= arrayOf(0, 0)

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val graph = Array(n){IntArray(8)}

    repeat(n){
        graph[it] = readLine().toString().split(" ").map { it.toInt() }.toIntArray()
    }

    dfs(0,0,n,graph)

    print("${answer[0]}\n${answer[1]}")
}

fun dfs(r : Int, c : Int, size : Int, graph : Array<IntArray>){
    var white = true
    var blue = true

    for(i in r until r+size){
        for(j in c until c+size){
            if(graph[i][j]==0) blue=false
            else white =false
        }
    }
    if(white){
        answer[0]++
        return
    }
    if(blue){
        answer[1]++
        return
    }
    dfs(r,c,size/2,graph)
    dfs(r,c+size/2,size/2,graph)
    dfs(r+size/2,c,size/2,graph)
    dfs(r+size/2,c+size/2,size/2,graph)
}
