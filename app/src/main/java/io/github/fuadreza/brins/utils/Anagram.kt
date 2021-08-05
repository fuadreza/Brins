package io.github.fuadreza.brins.utils

fun primes(): Sequence<Long> {
    var i = 2L
    return generateSequence { i++ }
        .filter { n -> (2L until n).none { n % it == 0L } }
}

val charToPrime = ('a'..'z').zip(primes().take(26).toList()).toMap()

fun String.toPrimeProduct() = this
    .filter { it != ' ' }
    .map { it.toLowerCase() }
    .fold(1L) { acc, c -> acc * charToPrime.getValue(c) }

fun String.isAnagramOf(other: String) = this.toPrimeProduct() == other.toPrimeProduct()