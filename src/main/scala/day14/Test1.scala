package day14

/**
 * 1. 单实例中的参数，可以在类中去调用
 * 2. 当构造参数是私有时，可以通过单实例来获得对象
 */


object Test1 {
  def main(args: Array[String]): Unit = {
    //    val student = new Student("bob","男")
    //    student.printInfo()

    // 当使用单实例的apply方法获得对象的时候，甚至可以把apply省略
    // 注意，此时的Student为Object
    //val student = Student.apply("alice","女")
    val student = Student("alice","女")
    student.printInfo()

  }
}

class Student private(val name: String, val sex: String) {
  def printInfo(): Unit = {
    println(s"姓名是: ${name}，性别是: ${sex}，学校是: ${Student.school}")
  }
}

object Student {
  val school: String = "北大青鸟"

  // 常规做法，用apply方法
  def apply(name: String, sex: String): Student = new Student(name, sex)
}
