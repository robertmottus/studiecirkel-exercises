package com.hackosynth.week3.isogram

object Isogram {
    fun isIsogram(input: String): Boolean {
        val chars = mutableSetOf<Char>()
        for (char in input) {
            if(!char.isLetter()) continue
            val c = char.toLowerCase()
            if(chars.contains(c))
                return false
            else
                chars.add(c)
        }
        return true;
    }
}