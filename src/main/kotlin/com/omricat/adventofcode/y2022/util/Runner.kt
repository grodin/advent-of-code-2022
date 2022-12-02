@file:JvmName("Runner")

package com.omricat.adventofcode.y2022.util

import com.omricat.adventofcode.y2022.Day1


fun main() {

  println("Part 1: ${Day1.part1(Day1.input)}")
  println("Part 2: ${Day1.part2(Day1.input)}")

}

fun printPart1(day: Day) {
  println("Day ${day.dayNumber}, part 1: ${day.part1(day.input)}")
}
fun printPart2(day: Day) {
  println("Day ${day.dayNumber}, part 2: ${day.part2(day.input)}")
}
