package day6

import scala.util.control.Breaks

/**
 * scala中的break用法
 * 1. 使用异常捕获
 * 2. 使用Break类
 */
object TestBreak {
  def main(args: Array[String]): Unit = {
    // 1 使用异常捕获
    try {
      for (i <- 1 to 10) {
        if (i == 10)
          throw new RuntimeException
        println(i)
      }
    } catch {
      case e: Exception =>
    }

    // 2 使用Break

    Breaks.breakable(
      for (i <- 10 to 13) {
        if (i == 13)
          Breaks.break()
        println(i)
      }
    )


  }

}
