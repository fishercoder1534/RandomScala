package oop_part2

object AbstractDataTypes extends App {
  abstract class Animal {
    val creatureType: String = "Wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"

    override def eat: Unit = println("crunch crunch")
  }

//  traits, similar to abstract classes that have abstract fields and/or methods that need to be implemented
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }

  trait ColdBlooded {
    def eat(animal: Animal): Unit
    val characteristics: String = "scary"
  }

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"

    override def eat: Unit = "nomnomnom"
    override def eat(animal: Animal): Unit =
      println(s"I'm a crocodile and I'm eating ${animal.creatureType}")
  }

//  traits vs abstract classes
//  1. both of them could have abstract methods/fields
//  2. multiples traits could be inherited by one class while only one abstract class could be extended by one class
//  3. traits = behavior; abstract classes = types of a class, "thing"

  val dog = new Dog
  val crocodile = new Crocodile
  crocodile.eat(dog)
  println(crocodile.preferredMeal)
  println(crocodile.characteristics)
}
