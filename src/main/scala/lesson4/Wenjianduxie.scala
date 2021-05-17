package lesson4

import java.io.PrintWriter
import scala.io.Source

object Wenjianduxie {
  def main(args: Array[String]): Unit = {

    // 1 读取文件
    val path = "D:/学习/Scala/src/main/resources/input.txt"
    Source.fromFile(path).foreach(print)

    // 2 写文件
    val writer = new PrintWriter("D:/学习/Scala/src/main/resources/output.txt")
    writer.write("人生若之如初见")
    writer.close()
  }

}
