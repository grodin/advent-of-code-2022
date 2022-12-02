package com.omricat.adventofcode.y2022

import com.omricat.adventofcode.y2022.util.AbstractDayTest

internal class Day1Test : AbstractDayTest<Day1>(
  Day1,
  input = """
    1000
    2000
    3000

    4000

    5000
    6000

    7000
    8000
    9000

    10000

  """.trimIndent(),
  part1Expected = 24_000,
  part2Expected = 45_000
)
