package com.hackosynth.week1.acronym

object Acronym {
    /**
     * Generates an acronym form a given sentence
     * @return the acronym for the sentence
     */
    fun generate(phrase: String): String {
        val words = phrase
            .replace("-", " ")
            .replace("_", " ")
            .replace("'", "")
            .split("\\s+".toRegex())
        return words.fold("", {acc, w -> acc + w.first().toUpperCase()})
    }
}
