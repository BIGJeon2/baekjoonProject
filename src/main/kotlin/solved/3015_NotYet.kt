package org.example.solved

import java.util.Stack

fun BaekJoon_3015() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val stack = Stack<Int>()
    var count = n-1

    repeat(n){
        val num = readLine().toInt()
        if (stack.isNotEmpty()) {
            if (stack.peek() < num){
                while (stack.isNotEmpty() && stack.peek() < num){
                    stack.pop()
                    count ++
                }
            }
        }
        stack.push(num)
        //println("${stack} :: count = ${count}")
    }

    var beforeNum = stack.pop()
    while (stack.isNotEmpty()){
        if (stack.peek() >= beforeNum){
            stack.pop()
        }else {
            beforeNum = stack.pop()
        }
        count ++
    }

    print("${count}")
}