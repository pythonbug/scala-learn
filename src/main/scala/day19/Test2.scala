package day19

/**
 * 元组的定义
 * 元祖元素的访问
 * 遍历元组
 */
object Test2 extends App {
  val tuple = (12, "a", 'z', true)
  // 拿到指定的元组元素
  println(tuple._1)
  println(tuple._2)
  println(tuple._3)
  println(tuple._4)

  // 遍历元组
  for(i<- 0 to 3){
    println(tuple.productElement(i))
  }

  println("==============================")
  for (i<- tuple.productIterator)
    println(i)

  //
  val tuple1 = ("a",12,("scala","hello"))
  println(tuple1._3._1)

}
