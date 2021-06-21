package day12


/**
 * 惰性加载，被调用才会执行
 */
object Test2 {
  def main(args: Array[String]): Unit = {
    lazy val result = sum(12, 15)
    println("1. =======================")
    // 在这里第一次被调用。
    println(s"2. result: ${result}")
    // 这里直接被打印出来
    println(s"3. result: ${result}")
  }

  def sum(a: Int, b: Int): Int = {
    println("4. sum被调用了")
    a + b
  }

}
