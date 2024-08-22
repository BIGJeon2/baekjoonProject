package org.example.solved

fun BaekJoon_1541() = with(System.`in`.bufferedReader()) {
    val expression = readLine()!!

    var total = 0
    var num = 0
    var isSum = true // status
    for (c in expression) {
        if (c == '-' || c == '+') {
            total += if (isSum) num else -num
            if (isSum) isSum = c == '+'
            num = 0 // num 초기화
        }
        else {
            num = num * 10 + (c - '0') // 자리수 처리
        }
    }
    total += if (isSum) num else -num // 마지막 숫자 처리

    print(total)
}