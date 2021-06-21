package day12

import scala.annotation.tailrec

/**
 * 利用柯里化，传名参数自定义一个while循环
 */
object Test1 {
  def main(args: Array[String]): Unit = {
    @tailrec
    def myWhile(condition: =>Boolean)(body: => Unit):Unit = {
      if(condition) {
        body
        myWhile(condition)(body)}
    }

    // 调用一下试试
    var n = 10
    // 若condition为Boolean，那么这里传的就是一个固定的结果，就变成了死循环了
    myWhile(n>=1)({
      println(n)
      n -= 1
    })

    def f():Unit = {
      333
    }

  }

}
