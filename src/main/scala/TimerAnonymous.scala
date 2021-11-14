object TimerAnonymous {
  /** The presence of an anonymous function in this example is revealed by the right arrow => which separates the function’s argument list from its body.
   * In this example, the argument list is empty, as witnessed by the empty pair of parenthesis on the left of the arrow.
   * The body of the function is the same as the one of timeFlies above.
   *
   * From: https://docs.scala-lang.org/tutorials/scala-for-java-programmers.html
   * */
  def oncePerSecond(callback: () => Unit): Unit = {
    var a = 1
    while (a < 5) {
      callback();
      Thread sleep 1000
      a += 1;
    }
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(() =>
      println("time flies like an arrow..."))
  }
}