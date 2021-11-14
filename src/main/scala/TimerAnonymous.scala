object TimerAnonymous {
  def oncePerSecond(callback: () => Unit): Unit = {
    var a = 1
    while (a < 5) {
      callback(); Thread sleep 1000
      a += 1;
    }
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(() =>
      println("time flies like an arrow..."))
  }
}