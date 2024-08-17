package org.example.solved

fun BaekJoon_2580() = with(System.`in`.bufferedReader()) {
    val sudokuMap = Array(9) { IntArray(9) { 0 } }

    for (i in 0..8) {
        sudokuMap[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    if (sudokuDFS(sudokuMap)) {
        for (i in sudokuMap) {
            for (j in i) {
                print("${j} ")
            }
            println()
        }
    } else {
        println("No solution exists.")
    }
}

private fun sudokuDFS(sudoku: Array<IntArray>): Boolean {
    for (i in 0..8) {
        for (j in 0..8) {
            if (sudoku[i][j] == 0) {
                for (k in 1..9) {
                    if (isSafe(sudoku, i, j, k)) {
                        sudoku[i][j] = k
                        if (sudokuDFS(sudoku)) {
                            return true
                        }
                        sudoku[i][j] = 0 // 백트래킹
                    }
                }
                return false // 어떤 숫자도 유효하지 않은 경우
            }
        }
    }
    return true // 모든 칸이 채워진 경우
}

private fun isSafe(sudoku: Array<IntArray>, row: Int, col: Int, num: Int): Boolean {
    // 행 검사
    for (i in 0..8) {
        if (sudoku[row][i] == num) return false
    }
    // 열 검사
    for (i in 0..8) {
        if (sudoku[i][col] == num) return false
    }
    // 3x3 박스 검사
    val startRow = row - row % 3
    val startCol = col - col % 3
    for (i in startRow until startRow + 3) {
        for (j in startCol until startCol + 3) {
            if (sudoku[i][j] == num) return false
        }
    }
    return true
}