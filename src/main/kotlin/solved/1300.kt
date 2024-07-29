package org.example.solved

fun BaekJoon_1300() = with(System.`in`.bufferedReader())  {
    val n = readLine().toInt()
    val k = readLine().toInt()

    println("${check(n, k)}")

}

fun check(arraySize: Int, index: Int) : Int {
    var low = 1
    var high = index

    while (low <= high) {
        var mid = (low + high) / 2
        var count = 0
        for (i in 1..arraySize){
            count += Math.min(mid/i, arraySize)
        }
        if (count < index){
            low = mid + 1
        }
        if (count >= index){
            high = mid - 1
        }
    }
    return low
}