package org.example

fun main() = with(System.`in`.bufferedReader())  {
    val (n,m) = readLine().split(" ").map { it.toInt() }
    val k = arrayListOf<Long>()

    repeat(n){
        k.add(readLine().toLong())
    }

    var high = k.max()
    var low = 1L

    while (low <= high){
        val mid = (low + high) / 2
        val count = checkCount(k, mid)

        if (count >= m) {
            low = mid + 1
        }else {
            high = mid - 1
        }
    }

    print("$high")
}
