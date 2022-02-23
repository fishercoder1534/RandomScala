//reference: http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-foldleft-example/

//The foldLeft method takes an associative binary operator function as parameter and will use it
// to collapse elements from the collection.
// The order for traversing the elements in the collection is from left to right
// and hence the name foldLeft.
// The foldLeft method allows you to also specify an initial value.

//Using foldLeft is fundamental in recursive function and will help you prevent stack-overflow exceptions.
object FoldLeftExamples extends App {
  def example1(): Unit = {
    println("Step 1: How to initialize a sequence of donut prices")
    val prices: Seq[Double] = Seq(1.5, 2.0, 2.5)
    println(s"Donut prices = $prices")

    println("\nStep 2: How to sum all the donut prices using foldLeft function")
    val sum = prices.foldLeft(0.0)(_ + _)
    println(s"Sum = $sum")

    println("\nStep 3: How to initialize a Sequence of donuts")
    val donuts: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
    println(s"Elements of donuts1 = $donuts")

    println("\nStep 4: How to create a String of all donuts using foldLeft function")
    val output = donuts.foldLeft("")((a, b) => a + b + " Donut ")
    println(s"All donuts = ${output}")

    println("\nStep 5: How to declare a value function to create the donut string")
    val concatDonuts: (String, String) => String = (a, b) => a + b + " Donut "
    println(s"Value function concatDonuts = $concatDonuts")

    println(
      "\nStep 6: How to create a String of all donuts using value function from Step 5 and foldLeft function"
    )
    println(s"All donuts = ${donuts.foldLeft("")(concatDonuts)}")
  }

  class Person(val name: String, val age: Int, val sex: Symbol)

  object Person {
    def apply(name: String, age: Int, sex: Symbol) = new Person(name, age, sex)
  }

  def example2(): List[String] = {
    val fooList = Person("Hugh Jass", 25, 'male) ::
      Person("Biggus Dickus", 43, 'male) ::
      Person("Incontinentia Buttocks", 37, 'female) ::
      Nil

    fooList.foldLeft(List[String]()) { (z, f) =>
      val title = f.sex match {
        case 'male   => "Mr."
        case 'female => "Ms."
      }
      z :+ s"$title ${f.name}, ${f.age}"
    }
  }

//  example1()
  val list = example2()
  println(list)
}
