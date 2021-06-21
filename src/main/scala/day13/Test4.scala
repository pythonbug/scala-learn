package day13

/**
 * 构造参数定义为val的才能被override重写，因为它们在类中任何位置都是可编辑的
 * 父类中要用val修饰的属性才能被加上override
 */

object Test4 {
  def main(args: Array[String]): Unit = {
    val AVGril : AVGril = new ssyy(12,88)
    println(AVGril.bust)
    AVGril.printInfo()
  }

}

class AVGril(val age:Int,val bust:Int){
  def printInfo(): Unit ={
    println(s"${age} ${bust} ")
  }
}

class ssyy(override val age:Int, override val bust:Int) extends AVGril(age,bust){
  override def printInfo(): Unit = {
    println("我是子类，请多多指教")
  }

}
