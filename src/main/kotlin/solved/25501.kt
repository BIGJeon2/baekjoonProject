package org.example.solved

fun BaekJoon_25501() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var count = 0

    fun recursion(str: String, start: Int, end: Int): Int{
        count++
        return if (start >= end) 1
        else if (str[start] != str[end]) 0
        else recursion(str, start + 1, end - 1)
    }

    fun isPalindrome(str: String) {
        count = 0
        println("${recursion(str, 0, str.length - 1)} $count")
    }

    repeat(n){
        isPalindrome(readLine().toString())
    }

}