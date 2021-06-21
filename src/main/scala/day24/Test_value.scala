package day24

/**
 * 元组和列表的变量声明
 */
object Test_value extends App {
  val (x, y) = (10, 11)
  println(x)
  println(y)

  val first :: second :: rest = List(1, 2, 3, 4)
  println(first)
  println(second)
  println(rest)

  println("--------------------------------------------")

  /**
   *
   */
  val list1 = List(("a", 1), ("b", 2), ("c", 3), ("a", 10))

  println("--------第一种")
  for ((word, value) <- list1) {
    println(word + " " + value)
  }

  println("--------第二种，只打印某一个元素")
  for((_,value) <- list1){
    println(value)
  }

  println("--------第三种，比较原始的")
  for(ele <- list1){
    println(ele._1 + " "+ele._2)
  }

  println("--------第四种，匹配特定值的，带一点过滤功能的")
  for(("a",value)<-list1){
    println(value)
  }




}
