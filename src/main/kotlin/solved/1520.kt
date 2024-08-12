package org.example.solved

fun BaekJoon_1520() = with(System.`in`.bufferedReader()) {
    val (n,m) = readLine().split(" ").map { it.toInt() }
    val dx = arrayOf(1, -1, 0, 0)
    val dy = arrayOf(0, 0, 1, -1)
    val inputArr = Array(n){IntArray(m){0}}
    val answer = Array(n){IntArray(m){-1}}

    for (i in 0 until n){
        inputArr[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    fun dfs(x: Int, y: Int): Int{
        if (x == n - 1 && y == m - 1) return 1
        if (answer[x][y] != -1) return answer[x][y]

        answer[x][y] = 0

        for (i in 0..3){
            val nx = x + dx[i]
            val ny = y + dy[i]

            if (nx !in 0 until n || ny !in 0 until m || inputArr[nx][ny] >= inputArr[x][y]) continue

            answer[x][y] += dfs(nx, ny)
        }
        return answer[x][y]
    }

    print(dfs(0,0))

}