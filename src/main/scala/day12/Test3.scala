package day12

/**
 * 使用一下包对象
 */
object Test3 {
  def main(args: Array[String]): Unit = {
    // 都是调用没毛病的
    println(name)
    whatName()
  }
}

// 采用新的方式自定义包也是没毛病的
// 因为都是在day12下面
package son{
  object Test3_1{
    def main(args: Array[String]): Unit = {
      println(name)
      whatName()
    }
  }
}