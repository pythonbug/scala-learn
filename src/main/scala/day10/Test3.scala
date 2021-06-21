package day10

/**
 * scala实现阶乘
 */
object Test3 {
  def main(args: Array[String]): Unit = {
    def myFactorial(n: Int): Int = {
      // 跳出的条件
      if (n == 1) n else n * myFactorial(n - 1)
    }

    // 试试
    println(myFactorial(5))

    // 经过调试我们也能看出，这个递归每次调用函数的时候，都会保留上层函数信息，然后再返回出去。
    // 使用尾递归进行优化。其实尾递归的作用就是把结果带到下层函数，其他的都不要了
    def myTailFactorial(n: Int, result: Int): Int = {
      if (n == 1) n * result else myTailFactorial(n - 1, result*n)
    }

    // 调用一下
    println(myTailFactorial(5, 1))

  }

}
