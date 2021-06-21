package day9

/**
 * 对一个数组进行操作
 */
object Test3 {
  def main(args: Array[String]): Unit = {
    def arrayOps(array: Array[Int], ops: Int => Int): Array[Int] = {
      for (ele <- array) yield ops(ele)
    }

    // 定义ops函数
    def ops1(a: Int): Int = {
      a + 1
    }

    // 调用函数
    val array = Array(1, 2, 3, 4, 5)
    println(arrayOps(array, ops1).mkString(","))

    // 使用匿名函数更加便捷
    arrayOps(array, ele => ele*2)
    // 也可以写成这样
    arrayOps(array, _*2)
    // 但是对于下面这样，就不能简写成下划线，因为用了不止一次了
    arrayOps(array,ele=>ele*ele)
    // arrayOps(array,_*_) 错误写法



  }

}
