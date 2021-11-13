/**
 * Created by stevesun on 1/22/17.
 */

import java.util.{Date, Locale}
import java.text.DateFormat._

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    val now = new Date
    val df = getDateInstance(LONG, Locale.GERMANY)
    println(df format now)
    val df1 = getDateInstance(LONG, Locale.CHINA)
    println(df1 format now)
    val df2 = getDateInstance(LONG, Locale.US)
    println(df2 format now)
  }
}
