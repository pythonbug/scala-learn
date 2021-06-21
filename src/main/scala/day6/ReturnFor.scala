package day6

/**
 * for 循环的返回值
 * 1. for循环的返回值是空
 * 2. for循环可以返回集合
 */
object ReturnFor {
  def main(args: Array[String]): Unit = {
    // 1 for循环的返回值是空
    val a = for (i <- 1 to 10) {
      i
    }
    println("a=" + a) // Unit对象

    // 2 使用关键字
    /**
     * for {子句} yield {变量或表达式}
     */
    val b = for (i <- 1 to 10) yield i
    println("b=" + b)

    val c = for (i <- 1 to 10) yield {
      s"${i} 是 xxx"
    }
    println(s"c=${c}")

  }

}
