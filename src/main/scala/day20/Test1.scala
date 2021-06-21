package day20

object Test1 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, 5)
    val list2 = List("a", 1, "b", 2)
    println("===============1. 获取集合头===============")
    println(list1.head)
    println("===============2. 获取集合尾===============")
    println(list1.tail)
    println("===============3. 获取集合最后一个数据===============")
    println(list1.last)
    println("===============4. 获取集合初始元素===============")
    println(list1.init)
    println("===============5. 反转===============")
    println(list1.reverse)
    println("===============6. 取前(后)n个元素===============")
    println(list1.take(3))
    println(list1.takeRight(3))
    println("===============7. 删除前(后)n个元素===============")
    println(list1.drop(3))
    println(list1.dropRight(2))
    println("===============8. 并集===============")
    val union = list1.union(list2)
    println(s"union: ${union}")
    println("union_1: " + (list1 ::: list2))
    val set1 = Set("a", "z", 13, 14)
    val set2 = Set("a", "z", 13, 14,15)
    val set3 = set1.union(set2)
    println(set3)
    println(set1 ++ set2)
    println("===============9. 交集===============")
    val listj = list1.intersect(list2)
    println(listj)
    println("===============10. 差集===============")
    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)
    println(diff1)
    println(diff2)
    println("===============11. 拉链===============")
    val zip1 = list1.zip(list2)
    val zip2 = list2.zip(list1)
    println(zip1)
    println(zip2)
    println("===============12. 开窗===============")
    // 第二个参数是步长
    for(ele <- list1.sliding(2,1)){
      println(ele)
    }


  }
}
