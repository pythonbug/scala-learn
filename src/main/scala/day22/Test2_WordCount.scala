package day22

object Test2_WordCount extends App {
  val list1 = List(
    ("hello", 1),
    ("hello world", 2),
    ("hello python", 3),
    ("hello kafka", 4),
    ("hello redis", 5),
    ("hello scala", 6)
  )

  val list2: List[(Array[String], Int)] = list1.map(x => {
    (x._1.split(" "), x._2)
  })

  println(list2)

  //  val list3 = list2.map(t => {
  //    (t._1.map(x=>{(x,t._2)}))
  //  }).flatten

  val list3 = list2.flatMap(t => {
    t._1.map(x => {
      (x, t._2)
    })
  })
  println(list3)

  val map1 = list3.groupBy(t => t._1)
  println(map1)

  val map2 = map1.map(kv => {
    val key = kv._1
    val value = kv._2.map(_._2).sum
    (key, value)
  })
  println(map2)

  val list4 = map2.toList.sortWith(_._2>_._2).take(3)

  println(list4)


}
