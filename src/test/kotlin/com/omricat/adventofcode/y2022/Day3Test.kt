package com.omricat.adventofcode.y2022

import com.omricat.adventofcode.y2022.util.AbstractDayTest

class Day3Test : AbstractDayTest<Day3>(
  Day3,
  input = """
    vJrwpWtwJgWrhcsFMMfFFhFp
    jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
    PmmdzqPrVvPwwTWBwg
    wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
    ttgJtRGJQctTZtZT
    CrZsJsPPZsGzwwsLwLmpwMDw
  """.trimIndent(),
  part1Expected= 157,
  part2Expected = 70
)
