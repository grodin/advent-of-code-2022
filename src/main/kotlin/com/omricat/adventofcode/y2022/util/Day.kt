package com.omricat.adventofcode.y2022.util

import java.io.IOException

abstract class Day(val dayNumber: Byte) {

  val input by lazy {
    Day::class.java
      .getResource("/day${dayNumber}_input.txt")
      ?.readText()
      ?: throw IOException()
  }

  init {
    check(dayNumber in 1..25)
  }


  abstract fun part1(input: String): Any
  abstract fun part2(input: String): Any
}
