package org.example.solved

import kotlin.math.abs
import kotlin.math.min

fun BaekJoon_14889() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = Array(n){IntArray(n)}
    val visitedMap = BooleanArray(n)
    var MIN = 1000000000

    repeat(n){
        map[it] = readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    fun checkSum(){
        var teamASum = 0
        var teamBSum = 0
        for (i in 0 until n - 1){
            for (j in i + 1 until  n){
                if (visitedMap[i] && visitedMap[j]) teamASum += map[i][j] + map[j][i]
                else if (!visitedMap[i] && !visitedMap[j]) teamBSum += map[i][j] + map[j][i]
            }
        }
        MIN = min(MIN, abs(teamASum - teamBSum))
    }

    fun dfs(idx: Int, count: Int) {
        if (count == n / 2){
            checkSum()
            return
        }
        for (i in idx until n){
            if (!visitedMap[i]){
                visitedMap[i] = true
                dfs(i + 1, count + 1)
                visitedMap[i] = false
            }
        }
    }

    dfs(0, 0)

    println(MIN)
}