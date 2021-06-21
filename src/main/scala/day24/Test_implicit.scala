package day24

/**
 * 隐式函数，隐式方法
 */
object Test_implicit extends App {

  // 隐式函数
  implicit def convert(num: Int): MyRichInt = new MyRichInt(num)

  println(12.myMax2(18))
  println(12.myMax(10))


  implicit class MyRichInt2(val self: Int) {
    def myMax2(num: Int): Int = if (num < self) self else num

    def myMin2(num: Int): Int = if (num < self) num else self
  }

  // 隐式参数
  implicit val namexxx: String = "张三"

  def hi(implicit name: String): Unit = {
    println("hi " + name)
  }

  hi

}

class MyRichInt(val self: Int) {
  def myMax(num: Int): Int = if (num < self) self else num

  def myMin(num: Int): Int = if (num < self) num else self
}