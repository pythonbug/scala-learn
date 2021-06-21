package day20

import scala.+:
import scala.collection.mutable.ListBuffer

/**
 * 基尼算法的实现
 */
object Test2 extends App {
  // 1 准备测试数据
  var tj_list = List(6, 3, 5, 7, 8)
  // 2 排序
  tj_list = tj_list.sorted
  // 3 每个元素变成累加变量
  var tj_list_buffer = ListBuffer[Int]()
  var result = 0
  for (i <- tj_list.indices) {
    result += tj_list(i)
    tj_list_buffer.append(result)
  }
  // 4 使每个值都落在[0,1]这个区间，貌似保留两位小数
  val max = tj_list_buffer.max.toDouble
  var new_tj_list_vector= for (i <- tj_list_buffer.indices) yield (tj_list_buffer(i) / max).formatted("%.2f")
  val new_tj_list_vector_buffer = new_tj_list_vector.toBuffer
  // 5 判断第一个元素是否为0，不为0则补0
  if(new_tj_list_vector_buffer.head.toDouble != 0.0) new_tj_list_vector_buffer.prepend(0.0.toString)
  println(new_tj_list_vector_buffer)
  // 6 计算基尼系数
  val Gini = 1-(new_tj_list_vector_buffer(1).toDouble+1)*0.8
  println(Gini.formatted("%.4f"))

}
