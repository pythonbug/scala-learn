package day5

/**
 * 输出九层妖塔
 *
 *
 */
object Exercise {
  def main(args: Array[String]): Unit = {
    for {i <- 1 to 9
         starNums = i * 2 - 1
         spaces = 9 - i
         } {
      println(" " * spaces + "*" * starNums)
    }
  }

}
