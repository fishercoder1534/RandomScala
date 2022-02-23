object __Deserializer__ extends App {
  def toInteger(line: String): Int = {
    try {
      line.toInt
    } catch {
      case e: Exception => 0
    }
  }

  println(toInteger("123"))
  println(toInteger("This is a cool line."))

}
