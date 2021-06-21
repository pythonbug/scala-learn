package day16

import scala.collection.mutable.ArrayBuffer

/**
 * 可变数组，ArrayBuffer
 * 新增数据，不可变数组用符号，可变数组用方法
 * 可变数组在后面追加的方法：append，在前面追加的方法 preppend
 */
object Test4 extends App {
  val arrayBuffer1 = new ArrayBuffer[Int](10)

  // 在后面追加
  arrayBuffer1.append(12, 13, 14)
  // 打印一下看看
  println(arrayBuffer1)
  // 在前面追加，依然按照从左到右的顺序
  arrayBuffer1.prepend(10, 9, 8)
  // 打印一下看看
  println(arrayBuffer1)

  // 任意位置追加
  arrayBuffer1.insert(1, 11)
  // 打印一下看看
  println(arrayBuffer1)

  // 删除元素
  // 根据索引删除
  arrayBuffer1.remove(1, 2)
  // 打印一下看看
  println(arrayBuffer1)

  // 根据值删除
  arrayBuffer1 -= (12)
  // 打印一下看看
  println(arrayBuffer1)
  // 假设有重复的，是删一个还是两个
  arrayBuffer1.append(99, 8, 99)
  println(arrayBuffer1)
  arrayBuffer1 -= (99)
  // 只会删除索引较小的那个
  println(arrayBuffer1)

  var arr2 = ArrayBuffer(12, 13, 14)

  // 可变数组转换为不可变数组
  val arrayBuffer2 = ArrayBuffer(12, 13, 14)
  val arr3 = arrayBuffer2.toArray
  println(arr3.mkString(","))

  // 不可变数组变为可变数组
  val arr4 = Array(7,8,9)
  val arrayBuffer3 = arr4.toBuffer
  println(arrayBuffer3)

}
