package day4

object forEach {
  def main(args: Array[String]): Unit = {
    for (i <- 1.to(10)) {
      println(i)
    }

    // 实际上可以用空格，更加的语言化
    for (i <- 1 to 10) {
      println(i)
    }

    //
    for (i <- Range(1, 10)) {
      println(i)
    }

    for (i <- 1 until 10) {
      println(i)
    }

    println("========================================")
    // 集合类型的遍历
    for (i <- Array(1, 2, 3, 4, 7)) {
      println(i)
    }
    println("========================================")
    for (i <- List(2, 3, 4, 90)) {
      println(i)
    }
    println("========================================")
    // 不重复的
    for (i <- Set("sad", "sad", "key")) {
      println(i)
    }
    println("循环守卫")
    for (i <- 1 until 11 if i == 5) {
      println(i)
    }
    println("循环步长=============================")
    // 循环步长
    for( i <- 1 to 10 by 2){
      println(i)
    }

    val what = if (3> 2) 2< 1
    println(what)

    println("一些问题=============================")
    // 一些问题
//    for( data <- 1.0 to 10.0 by 0.3){
//      println(data)
//    }

    for( data <- BigDecimal(1.0) to BigDecimal(10.0) by 0.3){
      println(data)
    }



  }

}
