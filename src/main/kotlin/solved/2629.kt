package org.example.solved

import kotlin.math.abs

fun BaekJoon_2629() = with(System.`in`.bufferedReader()) {
    val pCount = readLine().toInt()
    val pendulumList =readLine().split(" ").map { it.toInt() }
    val bCount = readLine().toInt()
    val ballList =readLine().split(" ").map { it.toInt() }
    val answer = Array(pCount + 1) { Array(40001) { false } }

    fun dp(cnt: Int, size: Int, num: Int){
        if (answer[cnt][num]) return
        answer[cnt][num] = true
        if (cnt == size) return

        dp(cnt + 1, size, num + pendulumList[cnt])
        dp(cnt + 1, size, num)
        dp(cnt + 1, size, abs(num - pendulumList[cnt]))
    }

    dp(0, pCount, 0)

    ballList.forEach{
        if (answer[pCount][it]){
            print("Y ")
        }else{
            print("N ")
        }
    }
}