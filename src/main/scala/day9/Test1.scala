package day9

object Test1 {
  def main(args: Array[String]): Unit = {
    // 把函数当作形参
    def f0(func: (Int, Int) => Int, a: Int, b: Int) = {
      println(func(a, b))
    }

    // 调用一下
    f0((a, b) => a + b, 31, 32)
    // 简略调用
    f0(_ + _, 31, 32)
  }

}
