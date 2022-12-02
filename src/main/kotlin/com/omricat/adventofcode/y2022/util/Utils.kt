package com.omricat.adventofcode.y2022.util

fun String.words(): List<String> =
  this.split("""\s+""".toRegex())

fun String.nonBlankLines(): List<String> =
  lines().filter { it.isNotBlank() }

fun <A, B> Pair<A, B>.swap(): Pair<B, A> = second to first
