@file:JvmName("Runner")

package com.omricat.adventofcode.y2022.util

import com.omricat.adventofcode.y2022.Day2


fun main() {
  printPart1(Day2)
  printPart2(Day2)
}

fun printPart1(day: Day) {
  println("Day ${day.dayNumber}, part 1: ${day.part1(day.input)}")
}
fun printPart2(day: Day) {
  println("Day ${day.dayNumber}, part 2: ${day.part2(day.input)}")
}
