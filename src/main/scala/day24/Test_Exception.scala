package day24

object Test_Exception extends App {
  try {
    val n = 10 / 1
  } catch {
    case e: ArithmeticException => println("发生算术错误")
    case e: Exception => println("发生一般错误")

  } finally {
    println("正常结束")
  }
}
