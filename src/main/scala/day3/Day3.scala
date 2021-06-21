package day3

object Day3 {
  def main(args: Array[String]): Unit = {
    // scala里面的 "==" 和java的equals差不多
    val a: Int = 123
    var b: Byte = 123
    println(a == b)

    val c: String = "hello"
    var d: String = new String("hello")

    println(c == d)
  }

}
