package day8

/**
 * 普通函数当做值进行传递
 * 1. 带参的普通函数
 * 2. 无参的普通函数
 */
object ParametricFunction {
  def main(args: Array[String]): Unit = {
    def f0(name: String): Int = {
      println("函数调用了")
      123
    }

    // 将函数传递
    val x = f0 _
    println(x)
    println(x("啥样"))

    // 或者直接指定类型
    val x1: String => Int = f0

    def f1():Int={
      println("不带参数的f1执行了")
      666
    }

    // 1 直接调用
    println(f1())

    println("===================================")

    // 2 打印出函数本身
    val x2 = f1 _
    println(x2)
    println(x2())

  }

}
