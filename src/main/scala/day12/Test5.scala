package day12

/**
 * scala中的访问修饰符
 * public 默认就是piblic，但是没有这个关键字
 * private 自己类中
 * protected 同类或者子类中
 * private[包名] 一个包的都能访问
 */
object Test5 {

}

class Person{
  // public
  val name:String = "张三"
  // 只能自己类使用
  private var idCard:String = "1001"
  // 同类或者子类
  protected val sex:String = "male"
  // 同一个包
  private[day12] var age: Int = 12
  // 这是啥玩意
  protected[day12] var age2: Int = 12
}

object Person{
  def main(args: Array[String]): Unit = {
    val person = new Person()
    person.sex
    person.age2
    person.name
    person.age
    person.idCard

    /**
     * 都能访问得到
     */

  }
}

/**
 * 换个其他名字的类试试
 */
object Person1{
  def main(args: Array[String]): Unit = {
    val person = new Person()
    person.age
    person.age2
    person.name
  }
}