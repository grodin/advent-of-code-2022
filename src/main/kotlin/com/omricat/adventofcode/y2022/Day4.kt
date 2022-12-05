package com.omricat.adventofcode.y2022

import com.omricat.adventofcode.y2022.util.Day
import com.omricat.adventofcode.y2022.util.nonBlankLines
import com.omricat.adventofcode.y2022.util.words

object Day4 : Day(4) {
  override fun part1(input: String): Int {
    return input.nonBlankLines().map { assignmentPair(it) }
      .count { (first, second) ->
        first.isSubrangeOf(second) ||
            second.isSubrangeOf(first)
      }

  }

  private fun assignmentPair(line: String): Pair<IntRange, IntRange> {
    val (section1, section2) = line.words(",").map {
      val (lower, upper) = it.split("-").map(String::toInt)
      lower..upper
    }
    return section1 to section2
  }

  override fun part2(input: String): Any {
    TODO("not implemented")
  }
}

private fun ClosedRange<Int>.isSubrangeOf(second: ClosedRange<Int>): Boolean =
  this.start >= second.start && this.endInclusive <= second.endInclusive
