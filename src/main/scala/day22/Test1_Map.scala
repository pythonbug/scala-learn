package day22

import scala.collection.{immutable, mutable}

/**
 * 经典的word count案例
 */
object Test1_Map extends App {
  val list1 = List("hello world", "hello scala", "hello spark", "hello java", "we study")

  // 1 扁平化
  val list2: List[Array[String]] = list1.map(_.split(" "))
  val list3 = list2.flatten
  println(list3)

  // 2 分组，把相同的单词分到一组
  val map: immutable.Map[String, List[String]] = list3.groupBy(word => word)
  println(map)

  // 3 统计每个列表的大小
  var map2: mutable.Map[String, Int] = mutable.Map()
  map.foreach((kv: ((String, List[String]))) => {
    val key = kv._1
    val value = kv._2.length
    map2.put(key, value)
  })
  println(map2)

  // 另外一种思路，使用map操作，直接生成新的map
  val map3 = map.map(kv => (kv._1 -> kv._2.length))

  println(map3)
  val map4 = map.map(kv => ((kv._1, kv._2.length)))
  println(map4)

  // 排序 转换成list进行排序
  val sortedList: List[(String, Int)] = map4.toList.sortBy(_._2)(Ordering[Int].reverse).take(3)
  println(sortedList)
  // 使用sortWith
  val sortedList2: List[(String, Int)] = map4.toList.sortWith(_._2 > _._2).take(3)
  println(sortedList2)

  // 元组和map都能使用 _1 _2吗

  val map10 = Map("a" -> 1)
  val tuple = Tuple2(("a", 1),("b",2))
  map10.map(_._2)
  println(tuple._1)

  /**
   * 结论，map和tuple都能使用 _n
   */
}
