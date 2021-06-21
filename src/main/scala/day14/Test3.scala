package day14

object Test3 {
  def main(args: Array[String]): Unit = {
    val js = new 剑圣
    js.skill()
    js.show()

  }

}

class 剑客 {
  val 攻击 = "平A"
  val 武器 = "剑"

  def show() = println(s"我是一个剑客，我的攻击是${攻击}，我的武器是${武器}")
}

trait 法师 {
  val 攻击 = "法术攻击"
  val jc:String

  def showRole() = println(s"我是一个剑客，我的攻击是${攻击}")

  def skill():Unit

}

class 剑圣 extends 剑客 with 法师{
  // 实现特质中的抽象属性和方法
  val jc:String = "123"

  // 重写一下特质和父类中的攻击
  override val 攻击 = "用刀砍"


  override def skill(): Unit = {
    println("大招一串五")
  }
}