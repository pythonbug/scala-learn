package day17

import scala.collection.mutable.ListBuffer

/**
 * 可变列表的一些操作
 */
object Test2 extends App {

  var listBuffer1 = ListBuffer(12,13,14)

  var listBuffer2 = ListBuffer(7,8,9)
  // 可变列表添加元素
  listBuffer1.append(15)
  println(listBuffer1)

  // 不可变列表添加元素
  val list1 = List(12,13,14)
  /*没有append方法，一般用符号
  * */
  // 加在前面
  listBuffer1.prepend(11)
  println(listBuffer1)

  // 可变的用符号，还是会生成一个新的可变列表
  listBuffer1 = listBuffer1 ++ listBuffer2
  println(listBuffer1)

  // 删除元素，虽然说是没有序列，我们依旧可以填入索引
  listBuffer1.remove(0)
  println(listBuffer1)

  // 删除指定元素
  listBuffer1 -= (14)
  println(listBuffer1)


}
