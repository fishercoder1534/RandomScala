object CollectionsExample extends App {
  val list = List(1, 2, 3, 4, 5)
  val list1 = List("A", "B", "C", "D")
  //apply operation to create a zip of list
  val list2 = list zip list1
  println(list2)

  val a = List(1, 2, 3, 4)
  val b = List("a", "b", "c")
  val d = b.zip(a)
  println(d)
  val e = d.unzip
  println(e)
}
