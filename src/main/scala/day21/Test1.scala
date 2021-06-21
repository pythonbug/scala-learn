package day21

import scala.math.Ordering

object Test1 extends App {
  val list1 = List(19, 51, 35, 81, 23)
  val list2 = List(("a", 10), ("b", 23), ("z", 96), ("t", 45), ("e", 30))
  println("===============1. 求和===============")
  println(list1.sum)

  println("===============2. 最大值===============")
  println(list1.max)

  /**
   * 柯里化的方式，传入一个函数
   */
  println(list2.maxBy(_._2))

  println("===============3. 最小值===============")
  println(list1.min)
  println(list2.minBy(_._2))

  println("===============4. 排序===============")
  val list3 = list1.sorted
  println(list3)
  // 倒过来 隐式转换的函数只需要写类型就可以了
  val list4 = list1.sorted(Ordering[Int].reverse)
  println(list4)

  // 简单一点的写法 从大到小
  val list5 = list1.sortWith( _ > _)
  println(list5)

  val list6 = list2.sortBy(_._2)(Ordering[Int].reverse)
  println(list6)


}
