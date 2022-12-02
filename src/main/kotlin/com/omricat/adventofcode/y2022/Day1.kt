import java.io.IOException

object Day1 {

  val input by lazy {
    this::class.java
      .getResource("day1_input.txt")
      ?.readText()
      ?: throw IOException()
  }

  fun part1(input: String): Int = input.lineSequence()
    .fold(initial = 0 to 0) { (max, prevElfAccum), line ->
      val foodItem = line.toIntOrNull()
      val elfAccum = if (foodItem != null) {
        prevElfAccum + foodItem
      } else {
        0
      }
      val newMax = if (elfAccum > max) elfAccum else max
      newMax to elfAccum
    }.first
}
