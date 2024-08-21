package org.example.solved

fun BaekJoon_1931() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val roomList = Array(n){IntArray(2)}
    repeat(n){
        roomList[it] = readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    roomList.sortWith { o1, o2 ->
        if (o1[1] == o2[1]) o1[0] - o2[0]
        else o1[1] - o2[1]
    }

    var endTime = roomList[0][1]
    var count = 1

    for (i in 1 until n){
        if (endTime <= roomList[i][0]){
            endTime = roomList[i][1]
            count++
        }
    }

    print(count)
}