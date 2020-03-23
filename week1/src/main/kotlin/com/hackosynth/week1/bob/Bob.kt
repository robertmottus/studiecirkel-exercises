package com.hackosynth.week1.bob

object Bob {
    /**
     * Returns bob's very well worded response to a given input.
     * @param input - the sentence spoken to bob
     * @return bob's response to the spoken sentence
     */
    fun hey(input: String): String {
        return with(input.trim()) {
            val yelling = isStrictUpperCase2
            val asking = endsWith("?")
            val silent = isEmpty()

            when {
                silent -> "Fine. Be that way!"
                asking && yelling -> "Calm down, I know what I'm doing!"
                asking -> "Sure."
                yelling -> "Whoa, chill out!"
                else -> "Whatever."
            }
        }
    }

    private val String.isStrictUpperCase2: Boolean
        get() = this.toUpperCase() == this && this.toLowerCase() != this
}
