package day15

/**
 * 不可变数组，带索引的Seq
 */
object Test3 extends App{
  // 定义数组的方法
  val arr = new Array[Int](10)

  // 第二种，利用Object
  val arr1 = Array.apply[Int](10)

  // 第三种
  val arr2 = Array(12,13,14,56)
  println(arr2.mkString(","))


}
