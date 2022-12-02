package com.omricat.adventofcode.y2022

import com.omricat.adventofcode.y2022.util.Day

object Day1 : Day(1) {

  override fun part1(input: String): Int = elvesFood(input).maxOf { it }

  override fun part2(input: String): Int = elvesFood(input)
    .sortedDescending().take(3).sum()

  private fun elvesFood(input: String): List<Int> =
    input.lines()
      .fold(mutableListOf(0)) { listOfElves, line ->
        if (line.isNotBlank()) {
          listOfElves.alterLast { it + line.toInt() }
        } else {
          listOfElves.add(0)
        }
        listOfElves
      }

  private fun <E> MutableList<E>.alterLast(fn: (E) -> E): Unit {
    if (isEmpty()) return
    val indexOfLast = size - 1
    val newLast = fn(last())
    this[indexOfLast] = newLast
  }
}
