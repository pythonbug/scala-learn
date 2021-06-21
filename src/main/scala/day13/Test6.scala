package day13

/**
 * 匿名子类
 */
object Test6 {
  def main(args: Array[String]): Unit = {
    val person = new Person {
      override var name: String = "好嘞"
    }
    println(person.name)
  }


}

abstract class Person{
  var name:String

}