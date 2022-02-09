package oop

object OOBasics extends App {
  val person = new Person
  println(person)

  val person2 = new Person2
  println(person2.age)
  println(person2.x)
  println(person2.greet("Daniel"))
  println(person2.greet())

  val person3 = new Person2("Rachel")
  println(person3.greet("Adam"))
}

class Person(name: String = "Steve", age: Int = 12) {
//  class parameters are not fields
//  meaning, in this Person class, you cannot access name or age by using dot operator: person.age
}

class Person2(val name: String = "Steve", val age: Int = 12) {
//  in this class, you can access name or age by using dot operator since they are fields of this class by using val keyword in front of them
  val x = 2
  println(1 + 3)

  def greet(name: String): Unit = {
    println(s"${this.name} says: Hi, $name")
  }

//  overloading
  def greet(): Unit = {
    println(s"Hi, I am ${this.name}")
  }

//  multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}
