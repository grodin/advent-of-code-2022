package com.omricat.adventofcode.y2022

import com.omricat.adventofcode.y2022.Day2.Rps.*
import com.omricat.adventofcode.y2022.util.Day
import com.omricat.adventofcode.y2022.util.words
import java.util.*

object Day2 : Day(2) {
  override fun part1(input: String): Int =
    input.lines()
      .fold(0) { score, line ->
        if (line.isBlank()) {
          score// Skip blank lines
        } else {
          val (opponent, self) = line.words().map(Rps::of)
          score + rpsResult(self, opponent).score + self.score
        }

      }

  enum class Rps(val score: Int) {
    Rock(1), Paper(2), Scissors(3);

    companion object {
      fun of(c: String): Rps =
        when (c.uppercase(Locale.getDefault())) {
          "A", "X" -> Rock
          "B", "Y" -> Paper
          "C", "Z" -> Scissors
          else -> throw IllegalArgumentException("Can't convert string \"$c\" to RPS")
        }
    }
  }

  private val winners = setOf(
    Rock to Scissors,
    Paper to Rock,
    Scissors to Paper
  )

  enum class RpsResult(val score: Int) {
    Win(6), Draw(3), Lose(0);
  }

  fun rpsResult(player1: Rps, player2: Rps): RpsResult = when {
    (player1 to player2) in winners -> RpsResult.Win
    player1 == player2 -> RpsResult.Draw
    else -> RpsResult.Lose
  }


  override fun part2(input: String): Any {
    TODO("not implemented")
  }

}

