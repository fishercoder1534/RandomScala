package oop_part2

object Generics extends App {
  class MyList[+A] {
//    use the type A
    def add[B >: A](element: B): MyList[B] = ???
  }

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  class MyMap[Key, Value]

//  generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

//  variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

//  1. yes, List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
//  what happens if you try to add a Dog into this list of cats?
// if it's a covariance list, then this action will turn it into a list of Animals/generic types

//  2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

//  3. Hello, no! CONTAVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

//  bounded types
  class Cage[A <: Animal](animal: A) //A is a subtype of Animal, in contrary, >: means supertype
  val cage = new Cage(new Dog)

}
