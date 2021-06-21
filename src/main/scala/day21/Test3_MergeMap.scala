package day21

import scala.collection.mutable

object Test3_MergeMap extends App {
  val map1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
  val map2 = Map("a" -> 12, "b" -> 5, "c" -> 4, "d" -> 10)

  // 合并，相同的key，把对应的value相加
//  map2.foreach(ele => {
//    if (map1.contains(ele._1)) {
//      map1.put(ele._1, ele._2 + map1.getOrElse(ele._1, 0))
//    } else {
//      map1.put(ele._1, ele._2)
//    }
//  })
//
//  println(map1)

  // 使用高级函数 fold
  val map3 = map2.foldLeft(map1)((mergedMap,kv)=>{
    val key = kv._1
    val value = kv._2
    mergedMap.put(key, value+mergedMap.getOrElse(key,0))
    mergedMap
  })

  println(map3)
}
