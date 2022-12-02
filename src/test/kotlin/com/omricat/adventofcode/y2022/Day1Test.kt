package com.omricat.adventofcode.y2022

import Day1
import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day1Test {
  val input = """
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

  """.trimIndent()

  @Test
  fun testPart1() {
    assertEquals(Day1.part1(input), 24_000)
  }
}
