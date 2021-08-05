package io.github.fuadreza.brins

import io.github.fuadreza.brins.utils.Fibonacci
import junit.framework.Assert.assertEquals
import org.junit.Test

class FibonacciTest {

    @Test
    fun testFibonacci() {
        val input = 5
        val output = listOf(0, 1, 1, 2, 3)

        assertEquals(output, Fibonacci.iterate(input))
    }
}