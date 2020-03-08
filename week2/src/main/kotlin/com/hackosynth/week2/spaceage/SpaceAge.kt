package com.hackosynth.week2.spaceage

import kotlin.math.round

class SpaceAge(val ageSeconds: Long) {
    fun round2dec(n: Double):Double = round(n*100)/100
    val daysInYear = 365.25

    fun onEarth(): Double = round2dec(ageSeconds.toDouble() / 31557600)
    fun onMercury(): Double = round2dec(onEarth() / 0.2408467)
    fun onVenus(): Double = round2dec(onEarth() / 0.61519726 )
    fun onMars(): Double = round2dec(onEarth() /  1.8808158)
    fun onJupiter(): Double = round2dec(onEarth() / 11.862615 )
    fun onSaturn(): Double = round2dec(onEarth() / 29.447498)
    fun onUranus(): Double = round2dec(onEarth() / 84.016846)
    fun onNeptune(): Double = round2dec(onEarth() / 164.79132)
}