package day8

object AnonymousFunction2 {
  def main(args: Array[String]): Unit = {
    // 1 定义一个函数，用来处理1,2的加减法
    def f0(func: (Int, Int) => Int): Int = {
      func(1, 2)
    }

    /**
     * 开始定义func的内容
     * func是一个匿名函数
     */
    val x = (a: Int, b: Int) => {
      a + b
    }

    val y = (a: Int, b: Int) => {
      a - b
    }

    println(f0(x))
    println(f0(y))
    println("===================================")

    /**
     * 由于匿名函数体内只有一行，
     * 所以可以把花括号取消,
     * 又因为，f0中已经定义好了参数的类型，
     * 所以这里不需要再加了
     * 又因为参数只出现了一次，
     * 所以可以使用_代替
     */

    f0(_ + _)

    f0(_ - _)

    /**
     * 假设是b-a的话，就不能再写成 _-_了
     * 应该写成 -_+_
     */

    println(f0(-_ + _))

    /**
     * 把普通函数当做值传递
     * 1. 有参数的函数
     * 2. 无参的函数
     */

  }

}
