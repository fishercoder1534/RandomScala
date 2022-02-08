package basics

object CBNvsCBV extends App {
  def calledByValue(x: Long): Unit = {
//    value is computed before the call, value is the same everywhere
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
//    expression is passed literally and it is evaluated at every use within this function
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
//  inside this function, System.nanoTime() is passed in as one value at that point of time, so it prints out two exact same values

  calledByName(System.nanoTime())
//  this is passing in the expression, literally by its name into calledByName() function, so it gets evaluated twice, so it prints out two different values

  def myIinfiniteFunc(): Int = 1 + myIinfiniteFunc()
  def printFirst(x: Int, y: => Int) = println(x)
//  printFirst(myIinfiniteFunc(), 34) //this one fails due to StackOverflowError because it's calling by value which means it's truly executing myIinfiniteFunc() before executing printFirst()
  printFirst(
    34,
    myIinfiniteFunc()
  ) //this one works out fine because it's calling by name, i.e. lazy evaluation. since printFirst only needs x to execute, y isn't really evaluated.
}
