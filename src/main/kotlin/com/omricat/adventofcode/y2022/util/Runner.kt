@file:JvmName("Runner")

package com.omricat.adventofcode.y2022.util

import com.omricat.adventofcode.y2022.Day3


fun main() {

  val daysToRun = listOf(Day3)

  daysToRun.forEach {
    printPart1(it)
    printPart2(it)
  }
}

fun printPart1(day: Day) {
  println("Day ${day.dayNumber}, part 1: ${day.part1(day.input)}")
}
fun printPart2(day: Day) {
  println("Day ${day.dayNumber}, part 2: ${day.part2(day.input)}")
}
