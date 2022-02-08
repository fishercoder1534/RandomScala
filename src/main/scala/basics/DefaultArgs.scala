package basics

object DefaultArgs extends App {
  def tailRecursionFactorial(n: Int, accumulator: Int = 1): Int = {
    if (n <= 1) accumulator
    else tailRecursionFactorial(n - 1, n * accumulator)
  }

  val fact10 = tailRecursionFactorial(3, 2)
  println(fact10)

  def savePicture(format: String = "jpg", width: Int = 1290, height: Int = 1080): Unit = {
    println("Saving picture")
  }
  savePicture()

  savePicture(width =
    800
  ) // you can specify any number of parameters as long as its clear enough for the compiler to infer
  savePicture(height = 100, width = 200) //order of parameters could be changed
}
