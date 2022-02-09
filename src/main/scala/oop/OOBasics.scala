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

  val writer = new Writer("John", "Doe", 2022)
  println(writer.fullName())

  val novel = new Novel(author = writer)
  novel.authorAge()
  println(novel.isWrittenBy(writer))
  val writer2 = new Writer("Jane", "Doe", 2022)
  println(novel.isWrittenBy(writer2))

  val counter = new Counter()
  println(counter.count)
  counter.increment.print
  counter.increment(10).print

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

class Writer(val firstName: String, val lastName: String, val year: Int) {
  def fullName(): Unit = {
    println(s"My full name is: ${this.firstName} ${this.lastName}")
  }
}

class Novel(
    val name: String = "Gone with the Wind",
    val year: Int = 1990,
    val author: Writer
) {
  def authorAge(): Unit = {
    println(s"${this.name}'s age is: ${this.year}")
  }

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, this.author)
}

class Counter(val count: Int = 0) {
  def increment = {
    println("Incrementing")
    new Counter(count + 1) //immutability, this shows that objects cannot be modified inside.
  }

  def decrement = {
    println("Decrementing")
    new Counter(count - 1)
  }

  def increment(n: Int): Counter = {
    if (n <= 0) this
    else increment.increment(n - 1)
  }
  def decrement(n: Int): Counter = {
    if (n <= 0) this
    else decrement.decrement(n - 1)
  }

  def print = println(this.count)
}
