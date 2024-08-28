package org.example.solved

fun BaekJoon_10870() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val fibonacci = IntArray(21){0}
    fibonacci[0] = 0; fibonacci[1] = 1
    for (i in 2 .. 20){
        fibonacci[i] = fibonacci[i-1] + fibonacci[i-2]
    }
    print(fibonacci[n])
}