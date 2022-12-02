import java.io.IOException
import java.util.PriorityQueue

object Day1 {

  val input by lazy {
    this::class.java
      .getResource("day1_input.txt")
      ?.readText()
      ?: throw IOException()
  }

  fun part1(input: String): Int = elvesFood(input).maxOf { it }

  fun part2(input: String): Int = elvesFood(input)
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
