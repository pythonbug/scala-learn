package day14

object Test2 {
  def main(args: Array[String]): Unit = {
    val s1 = Student2.getInstance();
    s1.printInfo()

    // 经过调试，发现到这里的时候，确实已经存在了一个对象
    val s2 = Student2.getInstance()
    s2.printInfo()

    println(s1)
    println(s2)
  }

}

class Student2 private(val name: String, val sex: String) {
  def printInfo(): Unit = {
    println(s"姓名是: ${name}，性别是: ${sex}")
  }
}

// 饿汉式
//object Student2 {
//  private var s = new Student2("bob", "male")
//
//  def getInstance(): Student2 = s
//
//}

// 懒汉式
object Student2 {
  private var s:Student2 = _

  def getInstance(): Student2 = {
    if(s == null){
      s = new Student2("bob", "male")
    }
    s
  }

}
