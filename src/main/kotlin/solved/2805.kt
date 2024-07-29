package org.example.solved

fun BaekJoon_2805() = with(System.`in`.bufferedReader())  {
    val (n,m) = readLine().split(" ").map { it.toLong() }
    val k = readLine().split(" ").map { it.toLong() }

    var high = k.max()
    var low = 0L

    while (low <= high){
        val mid = (low + high) / 2
        val totalLength = checkTreeLength(k, mid)

        if (totalLength >= m) {
            low = mid + 1
        }else {
            high = mid - 1
        }
    }

    print("$high")
}

fun checkTreeLength(treeArray: List<Long>, mid: Long) : Long{
    var totalLength = 0L
    treeArray.forEach{
        if (it > mid) totalLength += it - mid
    }
    return totalLength
}