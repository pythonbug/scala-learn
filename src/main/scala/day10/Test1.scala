package day10

/**
 * 定义一个函数func，接收参数为Int。返回一个函数，记作f1。
 * f1接收一个参数String类型。返回一个函数f2。
 * f2接受一个Char类型参数，返回类型Boolean。
 * 要求调用f(0)("")('0')返回false，其他情况返回true
 */
object Test1 {
  def main(args: Array[String]): Unit = {

    //    def func(a: Int): String =>(Char=>Boolean) = {
    //        f1
    //    }
    //
    //    def f1(b: String): Char=>Boolean = {
    //        f2
    //    }
    //
    //    def f2(c: Char): Boolean = {
    //      if (c == '0') false else true
    //    }
    //
    //    // 调用
    //    println(func(1)("")('0'))

    def func(a: Int): String => (Char => Boolean) = {
      b => c => if (a == 0 && b == "" && c == '0') false else true
    }

    println(func(0)("33")('0'))

    // 柯里化
    def func1(a: Int)(b: String)(c: Char): Boolean = {
      if (a == 0 && b == "" && c == '0') false else true
    }
  }

}
