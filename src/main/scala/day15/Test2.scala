package day15

/**
 * 1. 枚举类
 * 2. 应用类
 * 3. Type自定义类型
 */
object Test2 extends App{
  val workDay = new WorkDay
  println(workDay.monday)
  println(workDay.name)

}

class WorkDay extends Enumeration{
  val monday:Value = Value(1,"星期一")

  type myString = String
  val name:myString = "你还"
}
