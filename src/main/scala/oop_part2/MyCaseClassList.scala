package oop_part2

/** Expand MyList - use case class and case objects */
abstract class MyCaseClassList {

  /**
   * head = first element of the list
   * tail = remainder of the list
   * isEmpty = is this list emtpy
   * add(int) => new list with this new element added
   * toString => a string representation of the list
   */

  def head: Int
  def tail: MyCaseClassList
  def isEmpty: Boolean
  def add(element: Int): MyCaseClassList
  def printElements: String

//  this is a polymorphic call
  override def toString: String = "{" + printElements + "}"
}

case object EmptyCaseClassList extends MyCaseClassList {

  /**
   * head = first element of the list
   * tail = remainder of the list
   * isEmpty = is this list emtpy
   * add(int) => new list with this new element added
   * toString => a string representation of the list
   */
  override def head: Int = throw new NoSuchElementException

  override def tail: MyCaseClassList = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add(element: Int): MyCaseClassList =
    new NonEmptyCaseClassList(element, EmptyCaseClassList)

  override def printElements: String = ""
}

case class NonEmptyCaseClassList(h: Int, t: MyCaseClassList) extends MyCaseClassList {

  /**
   * head = first element of the list
   * tail = remainder of the list
   * isEmpty = is this list emtpy
   * add(int) => new list with this new element added
   * toString => a string representation of the list
   */
  override def head: Int = h

  override def tail: MyCaseClassList = t

  override def isEmpty: Boolean = false

  override def add(element: Int): MyCaseClassList = new NonEmptyCaseClassList(element, this)

  override def printElements: String = {
    if (t.isEmpty) "" + h
    else h + " " + t.printElements
  }
}

object CaseClassListTest extends App {
  val list = new NonEmptyCaseClassList(
    1,
    new NonEmptyCaseClassList(2, new NonEmptyCaseClassList(3, EmptyCaseClassList))
  )
  val cloneOfList = new NonEmptyCaseClassList(
    1,
    new NonEmptyCaseClassList(2, new NonEmptyCaseClassList(3, EmptyCaseClassList))
  )
  println(list.head)
  println(list.tail.head)
  println(list.tail.tail.head)
  println(list.isEmpty)
  println(list.toString)
  val list2 = list.add(4)
  println(list2.toString)
  println(list == cloneOfList)
}
