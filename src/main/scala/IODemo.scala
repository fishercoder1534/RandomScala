import java.io.{File, PrintWriter}
import scala.io.Source

/**
  * Created by fishercoder1534 on 1/22/17.
  */
object IODemo {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    val inputFile = "input_file.txt"
    val outputFile = "user.out"
    val writer = new PrintWriter(new File(outputFile))

    try {
      for (line <- Source.fromFile(inputFile).getLines()) {
        val param_1 = __Deserializer__.toInteger(line)
        println(param_1)
        val ret = Solution.reverse(param_1)
        writer.write(__Serializer__.serialize(ret))
      }
    } catch {
      case ex: Exception => println("Bummer, an exception happened.")
    }

//    writer.write("Hello Developer, Welcome to Scala Programming.")
    writer.close()
    Source.fromFile(outputFile).foreach { x => print(x) }

    println("Program finished!")
  }
}
