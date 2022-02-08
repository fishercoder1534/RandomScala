package basics

object Expressions extends App {
  val x = 1 + 2 //Expression
  println(x)

  var y = 1
  y *= 2
  println(y)

  //  EVERYTHING in Scala is an EXPRESSION!
  //  If in Scala is an expression also, not an instruction
  //  Code blocks in Scala are expressions as well, the value of the block is the value of its last expression
  //  Unit === void

  //instructions are executed (Java), meaning to do something
  //expressions are evaluated(Scala)

  //  Do NOT use while loops in Scala!

  val someValue = {
    2 < 3
  }

  println(someValue)

  val anotherValue = {
    val result = if (someValue) 123 else 456
    789
  }
  println(anotherValue)
}
