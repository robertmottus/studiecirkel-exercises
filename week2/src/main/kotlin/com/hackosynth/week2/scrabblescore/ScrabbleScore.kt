package com.hackosynth.week2.scrabblescore

object ScrabbleScore {

     word.toUpperCase().fold(0, {acc,ch -> acc+ when {
         "AEIOULNRST".contains(ch) -> 1
         "DG".contains(ch) -> 2
         "BCMP".contains(ch) -> 3
         "FHVWY".contains(ch) -> 4
         "K".contains(ch) -> 5
         "JX".contains(ch) -> 8
         "QZ".contains(ch) -> 10
         else -> 0
     } })
}
