package day24

/**
 * 样例类的模式匹配
 */
object Test_caseclassmatch {
  def main(args: Array[String]): Unit = {
    val s1 = Student1("小王", 19)
    val r = s1 match {
      case Student1("小王", 18) => "yes"
      case _ => "no"
    }

    println(r)

  }
}

case class Student1(name: String, age: Int)