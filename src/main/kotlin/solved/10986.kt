package org.example.solved

fun BaekJoon_10986() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numList = readLine().split(" ").map { it.toLong() }
    val dp = LongArray(n+1)
    val count = LongArray(m)

    for (i in 1 ..  n){
        dp[i] = (dp[i - 1] + numList[i - 1]) % m
        count[dp[i].toInt()]++
    }

    var answer = count[0]

    for (i in 0 until m){
        answer += count[i] * (count[i] - 1) / 2
    }

    print(answer)
}