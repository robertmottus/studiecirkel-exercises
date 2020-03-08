package com.hackosynth.week1.bob

object Bob {
    /**
     * Returns bob's very well worded response to a given input.
     * @param input - the sentence spoken to bob
     * @return bob's response to the spoken sentence
     */
    fun hey(input: String): String {
        val trimmedInput = input.trim()
        val yelling = isStrictUpperCase(trimmedInput)
        val asking = trimmedInput.endsWith("?")
        val silent = trimmedInput.isEmpty()

        return when {
            silent -> "Fine. Be that way!"
            asking && yelling -> "Calm down, I know what I'm doing!"
            asking -> "Sure."
            yelling -> "Whoa, chill out!"
            else -> "Whatever."
        }
    }

    fun isStrictUpperCase(str: String) : Boolean =
        str.toUpperCase() == str &&
                str.toLowerCase() != str
}
