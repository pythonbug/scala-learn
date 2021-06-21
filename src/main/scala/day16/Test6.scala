package day16

object Test6 extends App{
  val list1 = List(12,13,14,"a")

  // list元素类型可以不一样哦
  // 遍历一下
  list1.foreach(println)

  // 生成列表的一种方法
  val list2 = 12 :: 13 :: 12 :: Nil
  println(list2)

  // 列表添加元素
  val list3 = 12 +: list2
  val list4 = list3 :+ 99
  println(list4)

}
