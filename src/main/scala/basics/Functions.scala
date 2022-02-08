package basics

object Functions extends App {
  def aFunction(a: String, b: Int): String =
    a + " plus " + b
  println(aFunction("hello", 3))

  def anotherFunction(): Int = 78
  println(anotherFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }
  println(aRepeatedFunction("hello ", 5))

//  In Scala, when you need LOOPS, use RECURSION! This is the fundamental idea of functional programming. ^ ^

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b

    aSmallFunction(n, n - 1)
  }
  println(aBigFunction(3))

  def greet(name: String, age: Int): String = {
    val msg = "Hello, my name is " + name + " and I am " + age + " old."
    msg
  }
  println(greet("Sophie", 18))

  def factorial(num: Int): Int = {
    if (num == 1) num
    else {
      factorial(num - 1) * num
    }
  }
  println(factorial(5)) //1 * 2 * 3 * 4 * 5 = 120

  def fibonacci(num: Int): Int = {
    if (num == 1) 1
    else if (num == 2) 1
    else {
      fibonacci(num - 1) + fibonacci(num - 2)
    }
  }
//  1, 1, 2, 3, 5, 8, 13, 21
  println(fibonacci(7))

  def isPrime(num: Int): Boolean = {
    def isPrimeUtil(t: Int): Boolean = {
      if (t <= 1) true
      else num % t != 0 && isPrimeUtil(t - 1)
    }
    isPrimeUtil(num / 2)
  }
  println(isPrime(12))
  println(isPrime(13))
}
