package oop_part2

abstract class MyGenericTypedList[+A] {

  /**
   * head = first element of the list
   * tail = remainder of the list
   * isEmpty = is this list emtpy
   * add(int) => new list with this new element added
   * toString => a string representation of the list
   */

  def head: A
  def tail: MyGenericTypedList[A]
  def isEmpty: Boolean
  def add[B >: A](element: B): MyGenericTypedList[B]
  def printElements: String

//  this is a polymorphic call
  override def toString: String = "{" + printElements + "}"
}

object GenericTypedEmptyList extends MyGenericTypedList[Nothing] {

  /**
   * head = first element of the list
   * tail = remainder of the list
   * isEmpty = is this list emtpy
   * add(int) => new list with this new element added
   * toString => a string representation of the list
   */
  override def head: Nothing = throw new NoSuchElementException

  override def tail: Nothing = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add[B >: Nothing](element: B): MyGenericTypedList[B] =
    new GenericTypedNonEmptyList(element, GenericTypedEmptyList)

  override def printElements: String = ""
}

class GenericTypedNonEmptyList[+A](h: A, t: MyGenericTypedList[A]) extends MyGenericTypedList[A] {

  /**
   * head = first element of the list
   * tail = remainder of the list
   * isEmpty = is this list emtpy
   * add(int) => new list with this new element added
   * toString => a string representation of the list
   */
  override def head: A = h

  override def tail: MyGenericTypedList[A] = t

  override def isEmpty: Boolean = false

  override def add[B >: A](element: B): MyGenericTypedList[B] =
    new GenericTypedNonEmptyList(element, this)

  override def printElements: String = {
    if (t.isEmpty) "" + h
    else h + " " + t.printElements
  }
}

object GenericTypedListTest extends App {
  val list1: MyGenericTypedList[Int] = new GenericTypedNonEmptyList[Int](
    1,
    new GenericTypedNonEmptyList[Int](
      2,
      new GenericTypedNonEmptyList[Int](3, GenericTypedEmptyList)
    )
  )
  println(list1.toString)

  val list2: MyGenericTypedList[String] = new GenericTypedNonEmptyList[String](
    "Hello",
    new GenericTypedNonEmptyList[String]("Scala", GenericTypedEmptyList)
  )
  println(list2.toString)
}
