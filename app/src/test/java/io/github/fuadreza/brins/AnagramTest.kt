package io.github.fuadreza.brins

import io.github.fuadreza.brins.utils.isAnagramOf
import junit.framework.Assert.assertEquals
import org.junit.Test

class AnagramTest {

    @Test
    fun testAnagram(){
        val firstWord = "Hello"
        val secondWord = "olelh"

        assertEquals(true, firstWord.isAnagramOf(secondWord))
    }
}