package org.example.solved

fun BaekJoon_2740() = with(System.`in`.bufferedReader()) {
    val (n1, m1) = readLine().toString().split(" ").map { it.toInt() }
    val matrixA = Array(n1){LongArray(m1)}
    repeat(n1){
        matrixA[it] = readLine().toString().split(" ").map { it.toLong() }.toLongArray()
    }

    val (n2, m2) = readLine().toString().split(" ").map { it.toInt() }
    val matrixB = Array(n2){LongArray(m2)}
    repeat(n2){
        matrixB[it] = readLine().toString().split(" ").map { it.toLong() }.toLongArray()
    }

    val answer = Array(n1){LongArray(m2)}
    for (i in 0 until n1){
        for (j in 0 until m2){
            for (k in 0 until m1){
                answer[i][j] += matrixA[i][k] * matrixB[k][j]
            }
        }
    }

    for (i in answer){
        for (j in i) {
            print("${j} ")
        }
        println()
    }

}