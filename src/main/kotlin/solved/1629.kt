package org.example.solved

fun maiBaekJoon_1629() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().toString().split(" ").map { it.toLong() }

    print("${dfs(n, m, k)}")

}

fun dfs(inputNum : Long, count : Long, division : Long): Long {
    return when(count){
        0L -> 1
        1L -> inputNum % division
        else -> {
            val n = dfs(inputNum, count / 2, division)

            if(count % 2 == 0L) (n * n) % division
            else ((n * n) % division) * inputNum % division
        }
    }
}