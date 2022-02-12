package oop

object MethodNotations extends App {
  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = {
//      yes, surprsingly, you could use + to name a function!!!
      s"${this.name} is hanging out with ${person.name} using plus operator as method name."
    }
    def +(nickName: String): Person = new Person(s"${this.name}, ($nickName)", favoriteMovie)
    def unary_! : String = {
      val x = s"What the heck is ${this.name}?"
      println(x)
      x
    }

    def isAlive: Boolean = true
    def apply(): String = s"Hi there, my name is ${this.name} and I like ${this.favoriteMovie}."
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(
    mary likes "Inception"
  ) //this is equivalent to the above method call, it's called infix notation = operator notation

//  "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)

//  ALL OPERATORS are METHODS in Scala
  println(mary + tom)

  println(1 + 2)
  println(1.+(2))

//  prefix notation, this is regarding unary operators
//  ATTENTION: unary_prefix only works with - + ~ !
  val x = -1
  val y = 1.unary_-
  println(x == y)
  println(!mary)

//  post-fix notation
  println(mary.isAlive)
  println(mary isAlive)

//  apply
  println(mary.apply())
  println(mary()) //this is equivalent to the above

  println((mary + "The Rock Star")())
  println((mary + "The Rock Star").apply())
}
