package basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

//  VALs are immutable

//  compiler can infer types
//  so it's also fine to write like
  val y = 42
  println(y)

  val z: String = "hello Scala"
  val aChar: Char = 'a'
  val aBoolean: Boolean = false

  //VARs are mutable!
  var variable: String = "hello from Scala"
  println(variable)
}
