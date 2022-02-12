package oop_part2

abstract class MyList {

  /**
   * head = first element of the list
   * tail = remainder of the list
   * isEmpty = is this list emtpy
   * add(int) => new list with this new element added
   * toString => a string representation of the list
   */

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element: Int): MyList
  def printElements: String

//  this is a polymorphic call
  override def toString: String = "{" + printElements + "}"
}

object EmptyList extends MyList {

  /**
   * head = first element of the list
   * tail = remainder of the list
   * isEmpty = is this list emtpy
   * add(int) => new list with this new element added
   * toString => a string representation of the list
   */
  override def head: Int = throw new NoSuchElementException

  override def tail: MyList = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add(element: Int): MyList = new NonEmptyList(element, EmptyList)

  override def printElements: String = ""
}

class NonEmptyList(h: Int, t: MyList) extends MyList {

  /**
   * head = first element of the list
   * tail = remainder of the list
   * isEmpty = is this list emtpy
   * add(int) => new list with this new element added
   * toString => a string representation of the list
   */
  override def head: Int = h

  override def tail: MyList = t

  override def isEmpty: Boolean = false

  override def add(element: Int): MyList = new NonEmptyList(element, this)

  override def printElements: String = {
    if (t.isEmpty) "" + h
    else h + " " + t.printElements
  }
}

object ListTest extends App {
  val list = new NonEmptyList(1, new NonEmptyList(2, new NonEmptyList(3, EmptyList)))
  println(list.head)
  println(list.tail.head)
  println(list.tail.tail.head)
  println(list.isEmpty)
  println(list.toString)
  val list2 = list.add(4)
  println(list2.toString)
}
