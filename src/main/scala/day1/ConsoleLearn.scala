package day1

import scala.io.StdIn

object ConsoleLearn {
  def main(args: Array[String]): Unit = {
    println("请输入你的姓名")
    val name = StdIn.readLine()
    println("请输入你的年龄")
    val age = StdIn.readInt()
    println(s"欢迎${age}岁的${name}来到")
  }

}
