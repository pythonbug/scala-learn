package day24

object Test_listcase extends App {
  // list里面的模式匹配
  val list1 = List(1, 2, 3, 4, 5)
  val list2 = List(0, 1)

  list2 match {
    case first :: second :: rest => println(s"first: $first, second: $second, rest: $rest")
    case _ => println("something else...")
  }

}
