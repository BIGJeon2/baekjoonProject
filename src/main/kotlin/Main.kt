package org.example

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong()
    val matrix = arrayOf(longArrayOf(1L, 1L), longArrayOf(1L, 0L))
    print("${pow(matrix, n-1)[0][0]}")
}

fun pow(matrix: Array<LongArray>, exponent: Long): Array<LongArray>{
    return when(exponent){
        0L, 1L -> matrix
        else -> {
            val n = pow(matrix, exponent / 2)
            if (exponent % 2 == 0L) multi(n, n)
            else multi(multi(n, n), matrix)
        }
    }
}

fun multi(mat1: Array<LongArray>, mat2: Array<LongArray>): Array<LongArray> {
    val tmp = Array(2) { LongArray(2) }

    for (i in 0 until 2) {
        for (j in 0 until 2) {
            for (k in 0 until 2) {
                tmp[i][j] += mat1[i][k] * mat2[k][j]
                tmp[i][j] %= 1000000007L
            }
        }
    }

    return tmp
}