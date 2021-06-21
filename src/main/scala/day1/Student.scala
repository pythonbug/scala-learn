package day1

class Student(name: String, age: Int) {

  def printinfo(): Unit = {
    println(name + " ," + age + "," + Student.school)
  }
}

object Student {
  val school: String = "麻省理工"

  val bili = new Student("碧梨", 12)
  val wangwei = new Student("王文", 13)

  def main(args: Array[String]): Unit = {
    bili.printinfo()
    wangwei.printinfo()
  }
}