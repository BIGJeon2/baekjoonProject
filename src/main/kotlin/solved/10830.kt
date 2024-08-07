package org.example.solved

fun BaekJoon_10830() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().toString().split(" ").map { it.toLong() }
    val matrix = Array(n.toInt()) { readLine().split(' ').map { it.toLong() % 1000L }.toLongArray() }

    for (i in pow(matrix, m)){
        for (j in i) {
            print("${j} ")
        }
        println()
    }
}

fun pow(matrix: Array<LongArray>, exponent: Long): Array<LongArray>{
    return when(exponent){
        1L -> matrix
        else -> {
            val n = pow(matrix, exponent / 2)
            if (exponent % 2 == 0L) multi(n, n)
            else multi(multi(n, n), matrix)
        }
    }
}

fun multi(mat1: Array<LongArray>, mat2: Array<LongArray>): Array<LongArray> {
    val size = mat1.size
    val tmp = Array(size) { LongArray(size) }

    for (i in 0 until size) {
        for (j in 0 until size) {
            for (k in 0 until size) {
                tmp[i][j] += mat1[i][k] * mat2[k][j]
                tmp[i][j] %= 1000L
            }
        }
    }

    return tmp
}