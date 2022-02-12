package oop_part2

object CaseClasses extends App {

  /** equals, hashCode, toString */

  case class Person(name: String, age: Int)
//  1. class parameters are fields
  val jim = Person("Jim", 34)

//  2. sensible toString
  println(jim.toString)

//  3. equals and hashCode implemented out of the box
  val jim2 = Person("Jim", 34)
  println(jim == jim2)

//  4. case classes have handy copy method
  val jim3 = jim.copy()
  println(jim3.toString)
  val jim4 = jim.copy(age = 47)
  println(jim4.toString)

//  5. case classes have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23)
  println(mary.toString)

//  6. case classes are serializable
//  Akka

//  7. case classes have extractor pattern = case classes can be used in PATTERN MATCHING
  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }

}
