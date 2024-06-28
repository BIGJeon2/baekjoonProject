package org.example

import java.util.ArrayList

fun BaekJoon_11066() = with(System.`in`.bufferedReader())  {
    repeat(readLine().toInt()){
        readLine().toInt()
        val arr = readLine().split(" ").map { it.toInt() }.sorted()
        checkSum(arr, if (arr.size % 2 == 0) arr.sum() else arr.sum() - arr.last())
    }
}

fun checkSum(arr: List<Int>, sum: Int){
    val count = arr.size / 2
    val na = arr.size % 2
    var total = sum
    val nextList = ArrayList<Int>()
    for (i in 0..< count){
        nextList.add(arr[i*2] + arr[i*2+1])
        total += nextList[i]
    }
    if (na != 0){
        nextList.add(arr.last())
    }
    if (count == 1){
        println(sum)
    }else{
        /*println(arr)
        println(sum)*/
        checkSum(nextList, total)
    }
}