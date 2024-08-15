package org.example.solved

fun BaekJoon_15652() = with(System.`in`.bufferedReader()) {
    val outPut = StringBuilder()
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numList = Array(n + 1){ i -> i}

    fun dfs(index: Int, length: Int, answer: String){
        if (length == m){
            outPut.append(answer).append("\n")
            return
        }

        for (i in index .. n){
            if (length == 0) dfs(i, 1, numList[i].toString())
            else dfs(i, length + 1, "$answer ${numList[i]}")
        }
    }

    dfs(1, 0, "")
    print(outPut.toString())
}