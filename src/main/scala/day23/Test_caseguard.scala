package day23

/**
 * case的模式守卫
 */
object Test_caseguard extends App {
  def abs(num: Int): Int = {
    num match {
      case i if i >= 0 => i
      case i if i < 0 => -i
      case _ => 0
    }
  }

  println(abs(-10))
  println(abs(5))

}
