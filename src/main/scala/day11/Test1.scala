package day11

/**
 * 传值参数和传名参数
 */
object Test1 {
  def main(args: Array[String]): Unit = {
    // 传值参数
    def f0(n: Int): Unit = {
      println(s"n: ${n}")
      println(s"n: ${n}")
    }

    def f1():Int={
      println("f1调用了")
      12
    }

    f0(f1())
    println("==============================")
    // 传名参数
    def f2(n: =>Int):Unit={
      println("进入函数了")
      println(s"n: ${n}")
      println(s"n: ${n}")
    }

    f2(f1())

    // 官网的例子


  }

}
