package day22

import scala.collection.mutable

object Test3_Queue extends App {

  val q1 = mutable.Queue[String]()
  q1.enqueue("a", "b", "c")

  println(q1)

  q1.dequeue()

  println(q1)

}
