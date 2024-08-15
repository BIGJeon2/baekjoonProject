package org.example.solved

fun BaekJoon_15650() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numList = Array(n + 1){ i -> i}
    val visitedList = Array(n + 1){ false}

    fun dfs(index: Int, length: Int, answer: String){
        if (length == m){
            println(answer)
            return
        }

        for (i in index .. n){
            if (!visitedList[i]){
                visitedList[i] = true
                if (length == 0) dfs(i, 1, numList[i].toString())
                else dfs(i, length + 1, answer + " " + numList[i].toString())
                visitedList[i] = false
            }
        }
    }

    dfs(1, 0, "")
}