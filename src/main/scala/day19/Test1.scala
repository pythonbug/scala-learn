package day19

import scala.collection.mutable

/**
 * 可变的映射map
 */
object Test1 extends App {
  val map1 = mutable.Map("a" -> 12, "b" -> 13, 15 -> "d")
  println(map1)
  println(map1.getClass)

  /*由于是可变的map，可以增加元素*/
  map1.put("c",14)

  /**
   * 按照源码，返回的应该是Some(value) 或者 None
   */
  println(map1.put("e",16)) //None
  println(map1.put("e",17)) // Some(16)
  /*使用符号的方式*/
  map1 += (("g",18))
  println(map1)

  /*map的合并*/
  val map3 = Map("dog" -> "狗") // 不可变映射
  val map4 = mutable.Map("猫" -> "cat") // 可变集合
  map4 ++= map3
  println(map4)

  val map5 = map3 ++ map4
  println(map5.getClass)



}
