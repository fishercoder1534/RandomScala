package oop_part2

object AnonymousClasses extends App {
  abstract class Animal {
    def eat: Unit
  }

//  anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahahahahaha")
  }

  /**
   * This is equivalent to
   *
   * class AnonymousClasses$anon$1 extends Animal {
   *   override def eat: Unit = println("ahahahaha")
   * }
   * val funnyAnimal: Animal = new AnonymousClasses$$anon$1
   */

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is ${name}, how can I help?")
  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi, my name is Jim, how can I help?")
  }
  println(jim)
}
