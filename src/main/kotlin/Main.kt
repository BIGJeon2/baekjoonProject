package org.example

fun main() = with(System.`in`.bufferedReader()) {
    readLine().toInt()
    val roadList = readLine().split(" ").map { it.toInt() }
    val priceList = readLine().split(" ").map { it.toInt() }
    var currPrice = priceList[0]
    var neededPrice = 0

    for (i in roadList.indices){
        val nextPrice = priceList[i]
        neededPrice += currPrice * roadList[i]
        if (nextPrice < currPrice) {
            currPrice = nextPrice
        }
    }

    print(neededPrice)
}