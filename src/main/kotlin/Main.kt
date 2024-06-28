package org.example

fun main() = with(System.`in`.bufferedReader()) {
    repeat(readLine().toInt()) {
        if (check(readLine().split(""))) println("YES") else println("NO")
    }
}