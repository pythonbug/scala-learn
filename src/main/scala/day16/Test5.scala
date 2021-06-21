package day16

/**
 * 多维数组
 */
object Test5 extends App{
  val multiArray = Array.ofDim[Int](2,3)
  // 赋值
  multiArray(0)(2) = 15
  multiArray(1)(2) = 15
  multiArray(1)(0) = 15

  // 遍历
  // 若参数只出现一次，则参数省略，后面调用参数可以用_替代
  multiArray.foreach(_.foreach(println))



}
