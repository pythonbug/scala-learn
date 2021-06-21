package day16

/**
 * 不可变数组，增加新的元素
 * 其实就是生成新的不可变数组
 */
object Test3 {
  def main(args: Array[String]): Unit = {
    val arr = Array(7,8,9)
    // 在末尾增加新元素
    val arr1 = arr.:+(10)
    // 在开头增加新元素
    val arr2 = arr1.+:(6)
    // 打印一下看看
    println(arr2.mkString(","))

    // 简略的写
    val arr3 = arr2 :+ 11
    // 注意当从开头加的时候，需要颠倒位置
    val arr4 = 5 +: arr3 :+ 12
    // 打印一下看看
    println(arr4.mkString(","))


  }

}
