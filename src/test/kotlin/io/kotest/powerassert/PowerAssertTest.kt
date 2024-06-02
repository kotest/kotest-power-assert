package io.kotest.powerassert

import io.kotest.assertions.eq.eq
import kotlin.test.Test

infix fun <T> T.shouldBe(expected: T) {
  // will be re-written by the plugin if enabled to the non-infix version that accepts an error message.
  val error = eq(this, expected)
  if (error != null) throw error
}

fun <T> T.shouldBe(expected: T, msg: String) {
  val error = eq(this, expected)
  if (error != null) {
    println(msg)
    throw error
  }
}

class PowerAssertTest {

  @Test
  fun test() {
    val hello = "Hello"
    val world = "world!"
    hello.length shouldBe world.substring(1, 4)
  }
}