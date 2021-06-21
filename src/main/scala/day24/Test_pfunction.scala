package day24

/**
 * 利用偏函数实现绝对值
 */
object Test_pfunction extends App {
  val positiveAbs: PartialFunction[Int, Int] = {
    case x if x > 0 => x
  }

  val negativeAbs: PartialFunction[Int, Int] = {
    case x if x < 0 => -x
  }

  val zeroAbs: PartialFunction[Int, Int] = {
    case 0 => 0
  }

  def abs(num: Int): Int = (positiveAbs orElse (negativeAbs) orElse (zeroAbs)) (num)

  println(abs(30))
  println(abs(-2))
  println(abs(0))


}
