package com.omricat.adventofcode.y2022.util

import kotlin.test.Test
import kotlin.test.assertEquals

abstract class AbstractDayTest<D: Day>(
  private val dayInstance: D,
  private val input: String,
  private val part1Expected: Any,
  private val part2Expected: Any,
) {

  @Test
  fun testPart1() {
    assertEquals(dayInstance.part1(input), part1Expected)
  }


  @Test
  internal fun testPart2() {
    assertEquals(dayInstance.part2(input), part2Expected)
  }

}
