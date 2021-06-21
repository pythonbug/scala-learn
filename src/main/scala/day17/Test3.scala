package day17

/**
 * Set 数据集
 * 无序，不重复
 * 默认是不可变的，可变需要显式的导包
 */
object Test3 extends App{
  val set1 = Set(12,13,'a',"a",'b','b',"a",true,false,true)
  println("==================")
  println(set1)

  // 添加元素
  val set2 = set1 + "我是你爸爸"
  val set3String = "我是你爷爷" + set2 // 就变成了拼接
  println(set2)
  println(set3String)
  /*实际上是 set.+("我是你爸爸")
  * 也就是说 + 是set1的一个方法，
  * 所以，肯定不能写成"我是你爸爸" + set1*/

  // 合并set
  val set3 = set2 ++ set1
  println(set3)

  // 删除元素
  val set4 = set3 - 12
  println(set4)


}
