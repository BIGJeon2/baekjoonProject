package org.example

fun BaekJoon_12015() = with(System.`in`.bufferedReader())  {
    val n = readLine().toInt()
    val k = readLine().split(" ").map { it.toInt() }
    val sequenceArr = mutableListOf<Int>()

    for (i in k){
        if (sequenceArr.isEmpty() || sequenceArr.last() < i){
            sequenceArr.add(i)
        }else {
            var low = 0
            var high =sequenceArr.lastIndex
            while (low < high){
                val mid = (low+high) / 2

                if (sequenceArr[mid] < i){
                    low = mid + 1
                }else{
                    high = mid
                }
            }
            sequenceArr[low] = i
        }
    }

    println("${sequenceArr.size}")
}