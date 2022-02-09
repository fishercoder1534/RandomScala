package basics

object StringOps extends App {
  val str: String = "Hello, I'm learning Scala."

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.length)
  println(str.toLowerCase())

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println(aNumber)
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

//  Scala-specific: String interpolators
//  S-interpolators
  val name = "Steve"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  println(greeting)
  val anotherGreeting = s"Hello, my name is $name and I am turning ${age + 1} years old next year"
  println(anotherGreeting)

  //  F-interpolators
  val speed = 1.2f
  val myth =
    f"$name%s can east $speed%2.2f burgers per minute" //%s means it's a string, %2.2f means it's a float number, 2 characters total, minimum 2 decimals precision
  println(myth)

//  raw-interpolator
  println(raw"This is a \n newline") //this will print out literally
  val escaped = "This is a \n newline"
  println(escaped)
  println(raw"$escaped")
//  raw interpolator ignores escaped characters inside raw strings.
}
