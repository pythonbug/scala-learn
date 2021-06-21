package day21

/**
 * 只做转换，不做规约，就是Map
 */
object Test2_Map {
  def main(args: Array[String]): Unit = {
    val list1 = List(12, 34, 18, 17, 26)
    println("====================过滤掉奇数====================")
    /**
     * 为true的时候保留，为false的时候过滤掉
     */
    val list2 = list1.filter((ele: Int) => {
      ele % 2 == 0
    })

    println(list2)

    // 简化一下
    val list3 = list1.filter(_ % 2 == 0)
    println(list3)

    println("====================map函数====================")

    /**
     * map函数
     */
    println(list1.map(_ * 2))
    println(list1.map(x => x * x))

    println("====================扁平化====================")
    val nestedList = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val f1 = nestedList.head ::: nestedList(1) ::: nestedList(2)
    println(f1)

    val f2 = nestedList.flatten
    println(f2)

    println("====================扁平化映射====================")
    val f3 = List("hello world", "hello scala", "hello java", "hello flink", "we study")
    // 先拆开
    val f4: List[Array[String]] = f3.map(_.split(" "))
    // 按照上面的，将List里面嵌套的都打散
    val f5 = f4.flatten
    println(f5)

    // 一步到位flatMap
    val f6 = f3.flatten(_.split(" "))
    println(f6)

    println("====================groupBy====================")
    // 分奇偶数
    val g1 = List(12, 13, 15)
    val g11: Map[String, List[Int]] = g1.groupBy[String]((x: Int) => {
      if (x % 2 == 0) "偶数" else "奇数"
    })
    println(g11)

    // 也可以不指定分组，自动指定分组
    val g111 = g1.groupBy(_ % 2)
    println(g111)

    println("====================reduce====================")
    val g2 = g1.reduce(_ - _)
    println(g2)
    val g3 = g1.reduceLeft(_ - _)
    println(g3)
    val g4 = g1.reduceRight(_ - _)
    println(g4)

    println("====================fold====================")
    // 需要给一个初始值
    val g5 = g1.fold(10)(_ + _)
    println(g5)


  }

}
