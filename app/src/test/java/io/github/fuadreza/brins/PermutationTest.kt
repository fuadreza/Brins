package io.github.fuadreza.brins

import io.github.fuadreza.brins.utils.Permutation
import junit.framework.Assert.assertEquals
import org.junit.Test

class PermutationTest {

    @Test
    fun testPermutations() {
        val n = 6
        val r = 3
        val output = 120

        assertEquals(output, Permutation.calculate(n,r))
    }
}