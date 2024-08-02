package org.example.solved

fun BaekJoon_11401() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().toString().split(" ").map { it.toLong() }
    val division = 1000000007L
    val child = factorial(n, division)
    val parent = (factorial(m, division) * factorial(n - m, division)) % division
    print("${child * pow(parent, division - 2, division) % division}")
}

fun pow(base: Long, expo: Long, division: Long): Long{
    if (expo == 1L) return base % division

    val tmp = pow(base, expo/2, division)

    return if (expo % 2 == 1L){
        tmp * tmp % division * base % division
    }else{
        tmp * tmp % division
    }
}

fun factorial(inputNum : Long, division: Long): Long {
    return if (inputNum <= 1L) 1L
    else (inputNum * factorial(inputNum - 1, division)) % division
}