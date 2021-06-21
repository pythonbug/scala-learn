package day9

/**
 * 函数当作返回值
 */

object Test2 {
  def main(args: Array[String]): Unit = {

    def f0(): Int => Unit = {

      def f1(a: Int): Unit = {
        println(s"f1调用咯${a}")
      }
      f1
    }

    // 如何调用呢
    println(f0) // f0返回的是一个函数，所以这里是一个引用

    println(f0()) // 应该也是一样的吧

    println(f0()(23))
  }
}
