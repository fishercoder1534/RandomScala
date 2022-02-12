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

  /**
   * 1. Generic trait MyPredicate[-T]
   * 2. Generic trait MyTransformer[-A, B]
   * 3. MyList:
   *    -map(tansformer) => MyList
   *    -filter(predicate) => MyList
   *    -flatMap(transformer from A to MyList[B] => MyList[B]
   *
   *    class EvenPredicate extends MyPredicate[Int]
   *    class StringToIntTransformer extends MyTransformer[String, Int]
   *
   *    [1,2,3].map(n * 2) = [2,4,6]
   *    [1,2,3,4].filter(n % 2) = [2,4]
   *    [1,2,3].flatMap(n => [n, n+1]) => [1,2,2,3,3,4]
   */
}
