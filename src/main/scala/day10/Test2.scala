package day10

/**
 * 柯里化
 */
object Test2 {
  def main(args: Array[String]): Unit = {

    def dealNum(a: Int): Int => Int = {
      def f0(b: Int): Int = {
        a + b
      }

      f0
    }

    // 调用一下
    println("======================")
    println(dealNum(3)(4))

    println("======================")
    // 固定a
    val f3 = dealNum(3)
    println(f3(4)) // 7

    // 简化一下函数
    def dealNum2(a: Int): Int => Int = {
      a + _
    }

    // 调用
    val f4 = dealNum2(777)
    println(f4(222))

    // 用更加方便的可里化
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }

    // 调用
    println("============================")
    println(addCurrying(3)(7))

  }

}
