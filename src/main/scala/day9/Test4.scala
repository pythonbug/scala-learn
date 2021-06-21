package day9

/**
 * 定义一个匿名函数，将其赋给变量fun。函数有三个参数，参数类型为Int,String,Char。
 * 当fun(0,"",'0')的时候返回false，其他情况返回true
 */
object Test4 {
  def main(args: Array[String]): Unit = {
    // 关注一下匿名函数的写法，无返回值类型，使用 => 代替 =
    val fun = (a: Int, b: String, c: Char) => {
      if (a == 0 && b == "" && c == '0') {
        false
      } else {
        true
      }
    }

    println(fun(0, "", '0'))

  }

}
