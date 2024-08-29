package org.example.solved

fun BaekJoon_24060() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numList = readLine().split(" ").map { it.toInt() }.toIntArray()
    var count = 0
    var result = -1

    fun merge(A: IntArray, low: Int, mid: Int, high: Int) {
        val temp = IntArray(high - low + 1)  // Temporary array to store merged elements
        var i = low
        var j = mid + 1
        var t = 0

        // Merge two halves into the temp array
        while (i <= mid && j <= high) {
            if (A[i] <= A[j]) {
                temp[t++] = A[i++]
            } else {
                temp[t++] = A[j++]
            }
        }

        // Copy remaining elements of left half, if any
        while (i <= mid) {
            temp[t++] = A[i++]
        }

        // Copy remaining elements of right half, if any
        while (j <= high) {
            temp[t++] = A[j++]
        }

        // Copy sorted elements back into the original array
        t = 0
        for (k in low..high) {
            count++
            A[k] = temp[t++]
            if (count == m) {
                result = A[k]
            }
        }
    }

    fun mergeSort(A: IntArray, low: Int, high: Int) {
        if (low < high) {
            val mid = (low + high) / 2
            mergeSort(A, low, mid)
            mergeSort(A, mid + 1, high)
            merge(A, low, mid, high)
        }
    }

    mergeSort(numList, 0, numList.size - 1)
    print(result)
}