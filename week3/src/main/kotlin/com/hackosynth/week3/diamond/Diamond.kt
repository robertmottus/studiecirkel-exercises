package com.hackosynth.week3.diamond

import java.lang.Math.abs

object Diamond {
    fun printToList(letter: Char): List<String> {
        require(letter in 'A'..'Z')
        val size = 1 + (letter - 'A') * 2 // width and height
        fun distanceFromCenter(rowIndex: Int) = abs(rowIndex - (size-1)/2)
        fun letter(rowIndex: Int) = letter - distanceFromCenter(rowIndex)
        var board:MutableList<String> = MutableList(size) {""}
        for(rowIndex in (0..size-1)) {
//            board[rowIndex].padEnd(size)
            val centerIndex = (size-1)/2
            val rowLetter = letter(rowIndex)
            var row = CharArray(size, {' '})
            if(rowIndex==0 || rowIndex==size-1) {
                row[centerIndex] = rowLetter
            } else {
                val colIndex1 = distanceFromCenter(rowIndex)
                row[colIndex1] = rowLetter
                val colIndex2 = size-1-distanceFromCenter(rowIndex)
                row[colIndex2] = rowLetter
            }
            board[rowIndex] = row.joinToString("")
        }
        return board
    }
}