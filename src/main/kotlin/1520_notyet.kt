package org.example

fun BaekJoon_1520() = with(System.`in`.bufferedReader()) {
    val (n,m) = readLine().split(" ").map { it.toInt() }
    val inputArr = Array(n){LongArray(m)}
    var result = n * (m-1)
    var count = 0

    for (i in 0 until n){
        val longArr = readLine().split(" ").map { it.toLong() }.toLongArray()
        inputArr[i]= longArr
    }

    for (i in 0 until n){
        for (j in 0 until m){
            val value = inputArr[i][j]
            if (i != n - 1 && j != m - 1){
                if (value >= inputArr[i][j+1] || value >= inputArr[i+1][j]){
                    result--
                }
            }else if (i == n - 1 && j != m - 1){
                if (value >= inputArr[i][j+1]){
                    result--
                }
            }else if (i != n - 1 && j == m - 1){
                if (value >= inputArr[i+1][j]){
                    result--
                }
            }
        }
    }
    print(result)
}