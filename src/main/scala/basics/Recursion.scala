package basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(num: Int): Int =
    if (num == 1) 1
    else {
      println("Computing factorial of " + num + " I first need to compute " + (num - 1))
      val result = num * factorial(num - 1)
      println("Computed factorial of " + num + " is: " + result)
      result
    }

  println(factorial(7))
//  println(factorial(5000))//This execution is going to fail due to StackOverflowError

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else
        factorialHelper(
          x - 1,
          x * accumulator
        ) // TAIL RECURSION = use recursive call as the LAST expression
    }

    factorialHelper(n, 1)
  }
  println(anotherFactorial(7))
  println(anotherFactorial(20000))
//  use @tailrec annotation to make sure that your recursive function is truly tail recursion

  def concat(aString: String, num: Int): String = {
    @tailrec
    def concatHelper(aStr: String, num: Int): String = {
      if (num <= 1) aStr
      else concatHelper(aStr + aStr, num - 1)
    }

    concatHelper(aString, num)
  }
  println(concat("hello ", 5))
}
