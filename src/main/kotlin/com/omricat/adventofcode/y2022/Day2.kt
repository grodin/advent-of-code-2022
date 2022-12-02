package com.omricat.adventofcode.y2022

import com.omricat.adventofcode.y2022.Day2.Rps.*
import com.omricat.adventofcode.y2022.util.Day
import com.omricat.adventofcode.y2022.util.nonBlankLines
import com.omricat.adventofcode.y2022.util.swap
import com.omricat.adventofcode.y2022.util.words
import java.util.*

object Day2 : Day(2) {
  override fun part1(input: String): Int =
    input.nonBlankLines()
      .fold(0) { score, line ->
        val (opponent, self) = line.words().map(Rps::of)
        score + rpsResult(self, opponent).score + self.score

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

  private val winMap = winners.toMap()

  private val loseMap = winners.associate { it.swap() }

  enum class RpsResult(val score: Int) {
    Win(6), Draw(3), Lose(0);

    companion object {
      fun of(s: String): RpsResult = when (s) {
        "X" -> Lose
        "Y" -> Draw
        "Z" -> Win
        else ->
          throw IllegalArgumentException("Can't convert string \"$s\" to RpsResult")
      }
    }
  }

  private fun rpsResult(player1: Rps, player2: Rps): RpsResult = when {
    (player1 to player2) in winners -> RpsResult.Win
    player1 == player2 -> RpsResult.Draw
    else -> RpsResult.Lose
  }


  override fun part2(input: String): Int =
    input.nonBlankLines().fold(0) { score, line ->
      val (opponent, result) = line.words()
      val opponentMove = Rps.of(opponent)
      val selfMove =
        when (RpsResult.of(result)) {
          RpsResult.Win -> loseMap[opponentMove]
          RpsResult.Draw -> opponentMove
          RpsResult.Lose -> winMap[opponentMove]
        }!! // Non-null because of how the map is constructed
      score + rpsResult(selfMove, opponentMove).score + selfMove.score
    }

}




