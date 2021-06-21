package day23

object Test_casetypes extends App {
  def describeType(x: Any): String = x match {
    case i: Int => "Int: " + i
    case i: List[Int] => "List[Int]: " + i
    case i: List[String] => "List[String]: " + i
    case i: Array[String] => "Array[String]: " + i.mkString(",")
    case i: Array[Int] => "Array[Int]: " + i.mkString(",")
    case x => "i donnot know: " + x
  }

  println(describeType(3))
  println(describeType("3"))
  println(describeType(List("a", "b"))) // 泛型擦除
  println(describeType(List(1, 2)))
  println(describeType(List("a", 1))) // 泛型擦除
  println(describeType(Array("a", 1))) // Array没有泛型擦除
  println(describeType(Array("a", "b")))
  println(describeType(Array(1, 2)))

  println("===============================================")

  for (arr <- List(
    Array(0),
    Array(0, 1),
    Array(0, "1"),
    Array(0, 0, 1),
    Array(1, 0, 1, 3),
  )) {
    val result = arr match {
      case Array(0) => "0"
      case Array(x, y) => "有两个元素的数组"
      case Array(x, y, z) => "有三个元素的数组"
      case Array(1, _*) => "以1开头的数组"
    }

    println(result)

  }

}
