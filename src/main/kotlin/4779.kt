package org.example

fun BaekJoon_4779() = with(System.`in`.bufferedReader())  {

    while(true){
        val input: String = readLine() ?: break

        var answer = "-"

        repeat(input.toInt()){
            answer = answer + " ".repeat(answer.length) + answer
        }

        println(answer)
    }

}