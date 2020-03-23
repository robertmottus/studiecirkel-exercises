package com.hackosynth.week1.darts

import java.lang.Math.sqrt

object Darts {
    /**
     * Given the x and y coordinates returns the score a dart landing there would yield
     * @param x - the X coordinate
     * @param y - the Y coordinate
     * @return the score the given coordinates would yield
     */
    fun score(x: Number, y: Number): Int {
        val radius = sqrt(square(x) + square(y))
        return when {
            radius <= 1.0 -> 10
            radius <= 5 -> 5
            radius <= 10 -> 1
            else -> 0
        }
    }

    fun square(x: Number) : Double = x.toDouble() * x.toDouble()
}
