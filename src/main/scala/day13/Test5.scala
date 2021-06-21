package day13

object Test5 {
  def main(args: Array[String]): Unit = {
    val biscuit = new Biscuit
    println(biscuit.color)
    println(biscuit.scrq)
    println(biscuit.wd)
    println(biscuit.zt)

    biscuit.printInfo()
    biscuit.show()
  }

}

abstract class Food {
  // 抽象属性
  val color: String

  var scrq: Int

  // 普通属性
  var wd:String = "甜的"

  val zt:String = "固态"

  // 抽象方法
  def show():Unit

  // 普通方法
  def printInfo():Unit = {
    println("好吃啊")
  }

}

// 子类继承抽象类

class Biscuit extends Food{
  // 实现抽象属性和方法，不需要加override
  val color = "yello"
  var scrq = 100

  // 对非抽象属性进行重写
  override val zt = "很硬啊"
  // 父类中用var修饰的非抽象属性，不要加override，因为其本身可变，没必要多次一举，直接重新赋值即可
  wd = "有点咸"

  // 抽象方法实现
  def show():Unit = {
    println("是奥利奥的")
  }

  override def printInfo(): Unit = {
    // 调用一下父类的方法
    super.printInfo()
    println("饼干不错")
  }

}
