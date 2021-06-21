package day22

import scala.collection.mutable

object Test4_parall {
  def main(args: Array[String]): Unit = {
    // 普通的
    (1 to 10).foreach(x=>{
      println(Thread.currentThread().getName)
    })

    println("======================")



  }

}
