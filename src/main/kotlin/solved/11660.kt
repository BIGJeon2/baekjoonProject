package org.example.solved

fun BaekJoon_11660() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numList = Array(n){IntArray(n)}
    val dp = Array(n+1){IntArray(n+1){0}}
    repeat(n){ it ->
        numList[it] = readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    for (i in 1 .. n){
        for (j in 1 .. n){
            dp[i][j] = dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1] + numList[i-1][j-1]
        }
    }

    repeat(m){
        val (x1,y1, x2,y2) = readLine().split(" ").map { it.toInt()}
        val result = dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1]
        println(result)
    }
}