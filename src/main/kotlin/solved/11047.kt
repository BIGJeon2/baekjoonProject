package org.example.solved

fun BaekJoon_11047() = with(System.`in`.bufferedReader()) {
    var (n, m) = readLine().split(" ").map { it.toInt() }
    val moneyList = IntArray(n)
    var count = 0

    repeat(n){
        moneyList[it] = readLine().toInt()
    }

    fun getMoneyCount(idx: Int, extraMoney: Int){
        count += extraMoney / moneyList[idx]
        if (idx != 0){
            getMoneyCount(idx - 1, extraMoney % moneyList[idx])
        }
    }

    getMoneyCount(n - 1, m)

    print(count)
}