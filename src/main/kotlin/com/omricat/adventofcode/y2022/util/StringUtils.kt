package com.omricat.adventofcode.y2022.util

fun String.words(): List<String> =
  this.split("""\s+""".toRegex())
