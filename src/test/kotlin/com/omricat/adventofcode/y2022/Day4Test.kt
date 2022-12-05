package com.omricat.adventofcode.y2022

import com.omricat.adventofcode.y2022.util.AbstractDayTest

class Day4Test : AbstractDayTest<Day4>(
  Day4,
  input = """
  2-4,6-8
  2-3,4-5
  5-7,7-9
  2-8,3-7
  6-6,4-6
  2-6,4-8
""".trimIndent(),
  part1Expected = 2,
  part2Expected = Any()
  )
