package day14

/**
 * 问题：
 * 假设父类和特质里面有一个var修饰的属性叫做 name
 * 那么子类中能否重写呢，var是不能用override去修饰的
 */
object Test4 {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    /*
    * 1. 先看看是否报错，应该会有冲突的错误。
    * 果然报错，冲突，不知道这里该调用父类的name，还是特质的name
    * 所以Dog类需要对name进行重写
    * */
    //println(dog.name)
    println(dog.name)
  }

}

class Animal{
  var name1 = "动物"
}

/**
 * 陆地生物
 */
trait TerrestrialCreatures {
  /**
   * 1. 假设name不是抽象的
   * 原来我用var去修饰，哪怕不去赋值，也是不需要去实现，
   * 调用的时候也不会冲突。
   * 如果使用val去修饰，就得去实现了。
   * 那么问题，假设我这里用val去修饰。
   * 1. 问题，我override的时候，肯定会冲突吗，还是自动识别出来，我这是重写的特质中的属性
   * 还是不行，无法识别出来，我是用的特质，还是父类。用特质就没错
   */

  val name:String
}

class Dog extends Animal with TerrestrialCreatures{
  /*由于name本身是由var修饰的
  * 我们知道，var修饰的，不能用overrride。
  * 那我们这里怎么重写呢？先试试override是不是报错。果然报错：mutable variable cannot be overridden。
  * 那么我再去试试不用override修饰，直接编译就过不去，`override` modifier required to override concrete member
  * 这特么就矛盾了啊，一个是重写属性必须要override，一个是var修饰的不能用override。
  * 那么真相只有一个：var修饰的属性，不用被重写，那怎么使用呢？是不是直接赋值就可以了呢？
  * 那么又有一个问题，在哪里赋值呢，看来只能在使用的时候赋值了。也不行
  * 那么我就重写的时候给它变更修饰符为val的试试，也不行，那么我怎么去调用name呢
  * */
  //override var name = "阿黄"
  override val name = "阿黄"
  val legs:Int = 4
}