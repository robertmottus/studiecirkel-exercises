package com.hackosynth.week3.naturalnumber

import com.hackosynth.week3.naturalnumber.Classification.*

enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

object NaturalNumber {
    fun classify(naturalNumber: Int): Classification {
        require(naturalNumber > 0)
        fun aliquotSum (n: Int):Int = (1..n/2)
            .filter {n%it==0}
            .sum()
        return when {
            aliquotSum(naturalNumber) < naturalNumber -> DEFICIENT
            aliquotSum(naturalNumber) > naturalNumber -> ABUNDANT
            else -> PERFECT
        }
    }
}