package org.example.solved

fun BaekJoon_7579() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val memoryList = readLine().split(" ").map { it.toInt() }
    val extraMemory = readLine().split(" ").map { it.toInt() }
    val dp = Array(n+1){LongArray(100001)}

    for (i in 1 .. n){
        for (j in dp[0].indices){
            if (extraMemory[i-1] <= j) dp[i][j] = (dp[i-1][j]).coerceAtLeast(dp[i-1][j - extraMemory[i-1]] + memoryList[i-1])
            else dp[i][j] = dp[i-1][j]
        }
    }

    var answer = 0
    for (i in dp[n].indices){
        if (dp[n][i] >= m){
            answer = i
            break
        }
    }

    print(answer)

}