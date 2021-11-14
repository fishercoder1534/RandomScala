object Timer {
  def oncePerSecond(callback: () => Unit): Unit = {
    var a = 1
    while (a < 5) {
      callback(); Thread sleep 1000
      a += 1
    }
    println("Finished the program..")
  }

  def timeFlies(): Unit = {
    println("time flies like an arrow...")
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFlies)
  }
}