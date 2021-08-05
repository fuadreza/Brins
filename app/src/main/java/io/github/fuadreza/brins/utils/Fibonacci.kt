package io.github.fuadreza.brins.utils

object Fibonacci {
    fun iterate(n: Int): List<Int> {
        val results = mutableListOf<Int>()
        var count = 0
        var n1 = 0
        var n2 = 1

        while (count < n) {
            results.add(n1)
            var nth = n1 + n2
            n1 = n2
            n2 = nth
            count++
        }
        return results
    }
}