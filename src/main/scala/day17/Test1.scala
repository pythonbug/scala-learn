package day17

/**
 * 合并两个列表
 */
object Test1 extends App{
  val list1 = 12 :: 13 :: 14 :: 15 ::Nil

  val list2 = 11 :: list1

  println(list1)
  println(list2)

  // 合并list1 list2
  val list3 = list1 ::: list2
  println(list3)

}
