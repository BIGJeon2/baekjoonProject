package org.example

fun BaekJoon_24416() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    print("${fib(n)} ${dp(n)}")


}

fun fib(input: Int) :Int{
    if (input == 1 || input == 2){
        return 1
    }else{
        return fib(input-1) + fib(input-2)
    }
}

fun dp(input: Int): Int{
    var count = 0
    val dpArr = IntArray(input)
    dpArr[0] = 1
    dpArr[1] = 1
    for (i in 2 until input){
        dpArr[i] = dpArr[i -2] + dpArr[i -1]
        count++
    }
    return count
}