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

  def concatTailRecursion(aString: String, num: Int): String = {
    @tailrec
    def concatHelper(aStr: String, num: Int, accumulator: String): String = {
      if (num <= 0) aStr
      else concatHelper(aStr, num - 1, accumulator + aStr)
    }

    concatHelper(aString, num, "")
  }
  var x = concatTailRecursion("hello ", 5)
  println(x)
  println(x.split(" ").length)

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRecursion(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else {
        println("Computing isPrime for ", t, " I first need: ", t - 1)
        isPrimeTailRecursion(t - 1, n % t != 0 && isStillPrime)
      }
    }

    isPrimeTailRecursion(n / 2, true)
  }
  println(isPrime(23))
  println(isPrime(22))
}
