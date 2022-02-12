package oop_part2

object Enums extends Enumeration with App {
  val READ, WRITE, EXECUTE, NONE = Value

  val somePermissions = Enums.READ;
  println(somePermissions)
}
