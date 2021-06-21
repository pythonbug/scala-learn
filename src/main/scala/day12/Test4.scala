package day12

import scala.beans.BeanProperty

/**
 * 类的学习
 */
object Test4 {
  def main(args: Array[String]): Unit = {
    val beautifulWoman = new BeautifulWoman()
    beautifulWoman.setXw(99)
    println(beautifulWoman.getXw)
  }
}

/**
 * 定义一个美女类
 * xw: 胸围
 * yw: 腰围
 * tw: 臀围
 *
 * 1. 确实是@BeanProperty加到哪一个属性上面，哪一个属性上面才能有get/set方法
 * 2. 若属性是private的，则无法加@BeanProperty去让其获得get/set方法 `BeanProperty` annotation can be applied only to non-private fields
 */
class BeautifulWoman{
  @BeanProperty
  var xw:Int = _
  var yw:Int = _
  var tw:Int = _
}
