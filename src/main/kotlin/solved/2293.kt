package org.example.solved

fun BaekJoon_2293() = with(System.`in`.bufferedReader()) {
    val (n, sum) = readLine().split(" ").map { it.toInt() }
    val coinList = IntArray(n)
    val dp = IntArray(100001){0}
    dp[0] = 1
    repeat(n){
        coinList[it] = readLine().toInt()
    }

    for (i in 0 until n){
        for (j in coinList[i] .. sum){
            dp[j] += dp[j - coinList[i]]
        }
    }

    print(dp[sum])
}