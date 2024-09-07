package org.example.solved

import java.util.ArrayList

lateinit var connected: Array<ArrayList<Int>>

fun BaekJoon_24479() = with(System.`in`.bufferedReader()) {
    val (n, m, first) = readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    connected = Array(n + 1){ArrayList()}
    val answer = Array(n+1){0}
    var count = 1

    repeat(m){
        val (start, end) = readLine().split(" ").map { it.toInt() }
        connected[start].add(end)
        connected[end].add(start)
    }

    connected.forEach { it.sort() }

    fun dfs(idx: Int){
        if (answer[idx] != 0) return
        answer[idx] = count++
        connected[idx].forEach{ next ->
            dfs(next)
        }
    }

    dfs(first)

    for (i in 1..n) {
        sb.append(answer[i]).append("\n")
    }

    print(sb)
}