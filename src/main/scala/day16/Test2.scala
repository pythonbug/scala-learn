package day16

object Test2 extends App {

  val arr = Array(12,35,32,12)


  println("===========第一种遍历============")
  // 注意要加上这个。如果下面用arr.iterator直接去调用方法就会死循环
  /**
   * 直接调用这个arr.iterator，相当于每一次都初始化，所以一直从0开始的
   * 将其传给一个变量，相当于只会在赋值的时候初始化
   */
  val itea = arr.iterator
  while (itea.hasNext)
    println(itea.next())

  for( i <- 1 to 10){
    println(arr.iterator.hasNext)

  }

  println("===============================")

  println("===========第二种遍历============")
  for(ele <- arr)
    println(ele)

  println("===============================")

  println("===========第三种遍历============")
  for(i <- 0 until arr.length)
    println(arr(i))

  println("===============================")

  println("===========第四种遍历============")
  for(i <- arr.indices)
    println(arr(i))

  println("===============================")

  println("===========第五种遍历============")
//  arr.foreach(println(_))
  arr.foreach(println)

  println("===============================")


}
