package org.example.solved

val answer_1780 = Array(3){0}

fun BaekJoon_1780() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val graph = Array(n){IntArray(n)}

    repeat(n){
        graph[it] = readLine().toString().split(" ").map { it.toInt() }.toIntArray()
    }

    dfs(0,0,n,graph)
    for (i in answer_1780){
        println(i)
    }
}

fun dfs(r : Int, c : Int, size : Int, graph : Array<IntArray>){
    var minusOne = true
    var zero = true
    var plusOne = true

    for(i in r until r+size){
        for(j in c until c+size){
            when(graph[i][j]){
                -1 -> {
                    zero = false
                    plusOne = false
                }
                0 -> {
                    minusOne = false
                    plusOne = false
                }
                1 -> {
                    zero = false
                    minusOne = false
                }
            }
        }
    }

    if(minusOne){
        answer_1780[0] += 1
    }
    if(zero){
        answer_1780[1] += 1
    }
    if (plusOne){
        answer_1780[2] += 1
    }

    if (!minusOne && !zero && !plusOne){
        dfs(r,c,size/3,graph)
        dfs(r,c+size/3,size/3,graph)
        dfs(r,c+(size/3*2),size/3,graph)
        dfs(r+size/3,c,size/3,graph)
        dfs(r+size/3,c+size/3,size/3,graph)
        dfs(r+size/3,c+(size/3*2),size/3,graph)
        dfs(r+(size/3 *2),c,size/3,graph)
        dfs(r+(size/3 *2),c+size/3,size/3,graph)
        dfs(r+(size/3 *2),c+(size/3*2),size/3,graph)
    }
}