package day22

/**
 * 模式匹配
 */
object Test5_match {
  def main(args: Array[String]): Unit = {
    val x = 2
    val y = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "i don't know"
    }

    println(y)
  }

}
