package oop_part2

import scala.util.control.Exception

object Exceptions extends App {
  val x: String = null

  def getInt(withExceptions: Boolean): Int = {
    if (withExceptions) throw new RuntimeException("No int for you!")
    else 42
  }
  val potentialFail =
    try {
      getInt(true)
    } catch {
      case e: RuntimeException => println("caught a RuntimeException.")
    } finally {
//    code that will get executed no matter what
      println("Finally.")
    }

  println(
    potentialFail
  ) //this is a union of the result from try block and the result from catch block
}
