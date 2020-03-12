package com.hackosynth.week2.matrix

class Matrix(private val matrixAsStringRaw: String) {
//    val matrixAsString = matrixAsStringRaw.trimIndent().replace("\\s+".toRegex(), " ")
    val matrixAsString = matrixAsStringRaw.trimIndent().replace(" +".toRegex(), " ")
    val rows = matrixAsString.split("\n").size
    val cols = matrixAsString.split("\n")[0].split(" ").size

    var matrix = Array(rows, {IntArray(cols)})

    init{
        for(rowNr in 1..rows) {
            val rowAsString = matrixAsString.split("\n")[rowNr - 1].trim() // <- varför behövs denna?
            for(colNr in 1..cols) {
                val element = rowAsString.split(" ")[colNr - 1].toInt()
                matrix[rowNr-1][colNr-1] = element
            }
        }
    }

    fun column(colNr: Int): List<Int> = matrix.map{row -> row[colNr-1]}
    fun row(rowNr: Int): List<Int> = matrix[rowNr-1].toList()
}