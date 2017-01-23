/**
  * Created by fishercoder1534 on 1/22/17.
  */
object __Deserializer__ {
  def toInteger(line: String): Int = {
    try {
      line.toInt
    } catch {
      case e: Exception => 0
    }
  }

}
