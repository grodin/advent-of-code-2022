package com.omricat.adventofcode.y2022

import com.omricat.adventofcode.y2022.util.AbstractDayTest

internal class Day2Test: AbstractDayTest<Day2>(
  dayInstance = Day2,
  input = """
    A Y
    B X
    C Z
    
  """.trimIndent(),
  part1Expected = 15,
  part2Expected = 12,
)
