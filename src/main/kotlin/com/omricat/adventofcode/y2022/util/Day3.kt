package com.omricat.adventofcode.y2022.util

import kotlin.streams.asSequence

object Day3 : Day(3) {

  private val ALPHABET = ('a'..'z').toSet().union('A'..'Z')

  override fun part1(input: String): Int =
    input.nonBlankLines().parallelStream().asSequence()
      .map { priorityOfCommonElement(it) }.sum()

  private fun priorityOfCommonElement(line: String): Int {
    require(line.length % 2 == 0)
    val halfLength = line.length / 2
    val firstHalf = line.substring(0, halfLength).toSet()
    val secondHalf = line.substring(halfLength).toSet()
    val commonElement = firstHalf.intersect(secondHalf).singleOrNull() ?: error(
      "More than one element in common"
    )
    return commonElement.priorityForAlphaChar()
  }

  private fun Char.priorityForAlphaChar(): Int {
    require(this in ALPHABET)
    return if (isLowerCase()) this - 'a' + 1
    else this - 'A' + 27
  }

  override fun part2(input: String): Int =
    input.nonBlankLines().asSequence()
      .windowed(size = 3, step = 3) { priorityOfBadge(it) }.sum()

  private fun priorityOfBadge(rucksacks: List<String>): Int {
    return rucksacks.map { it.toSet() }.reduce { a, b -> a.intersect(b) }
      .single().priorityForAlphaChar()
  }
}
