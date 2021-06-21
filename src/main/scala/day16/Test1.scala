package day16

/**
 * 数组：不可变的集合，属于带索引的Seq
 */
object Test1 extends App {
  val arr = myApply(12,2,3,43,5)
  println(arr.mkString(","))

}

/**
 * 模拟背诵一下Array的apply
 */


class myApply {

}

object myApply{
  def apply(x: Int, xs: Int*): Array[Int] = {
    // 初始化
    val lengths = xs.length + 1
    val arr = new Array[Int](lengths)
    // 赋值
    arr(0) = x
    var i = 1
    for(j <- xs.iterator){
      arr(i) = j
      i += 1
    }
    arr
  }
}


