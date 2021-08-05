package io.github.fuadreza.brins.utils

object Permutation {
    fun calculate(n: Int, r: Int): Int {
        val topList = mutableListOf<Int>()
        val bottomList = mutableListOf<Int>()
        val nMinR = n - r

        for (i in 1 until n + 1) {
            topList.add(i)
        }

        for (i in 1 until nMinR + 1) {
            bottomList.add(i)
        }

        var top = 1

        topList.forEach { i ->
            top *= i
        }

        var bottom = 1

        bottomList.forEach { i ->
            bottom *= i
        }

        return top / bottom
    }
}