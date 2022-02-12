package oop_part2

object Objects extends App {

//  SCALA does NOT have class-level functionality ("static" in Java)
  object Person {
    val N_EYES = 2
    def canFly: Boolean = false

    def from(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(name: String) {
//    instance-level functionality
  }
//  writing object and class at the same place is called COMPANIONS

  println(Person.N_EYES)
  println(Person.canFly)

//  In Scala, objects are singleton instances, they are all singleton objects in Scala
  val mary = Person
  val john = Person
  println(mary == john)

  val mary1 = new Person("Mary")
  val john1 = new Person("John")
  println(mary1 == john1)

  val bobbie = Person.from(mary1, john1)

//  Scala applications = Scala object with def main(args: Array[String]): Unit because Scala programs are translated into Java to run
}
