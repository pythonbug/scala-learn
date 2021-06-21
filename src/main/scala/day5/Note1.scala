package day5

/**
 * scala怎么替代Java中的continue
 * 还是比java写起来方便很多
 */
object Note1 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10 if i != 10) {
      println(i)
    }
  }

}
