package oop_part2

object InheritanceAndTraits {
  class Animal {
    val creatureType = "wild"
    def eat = println("nomomo")
  }

  class Cat extends Animal {
    def crunch = {
      println("crunch crunch")
    }
  }

  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  class Dog extends Animal {
    override val creatureType = "domestic"
    override def eat = println("dog eating, eating")
  }

  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.eat
    cat.crunch

    val dog = new Dog
    dog.eat
    println(dog.creatureType)

    //  type substitution
    val unknownAnimal: Animal = new Dog
    println("creating a new animal")
    unknownAnimal.eat
  }

//  preventing overrides:
//  1. final a member
//  2. final a class
//  3. seal a member/class using keyword sealed
}
