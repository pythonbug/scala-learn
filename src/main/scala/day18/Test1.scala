package day18

/**
 * Map的创建
 * 循环遍历整个map
 * 分别循环key和value
 * 安全的方式拿到value
 */
object Test1 extends App {
  val map1 = Map("a" -> 12, "b" -> '额', "c" -> 14)
  // 遍历循环整个map
  map1.foreach(println)
  // 类型省略之后，发现参数只有一个，可以省略圆括号，其他情况：没有参数，或者参数多余1，则永远不能省略
  /**
   * 所以 map1.foreach(kv:(String,Int) => println(kv)) 的写法错误
   */
  map1.foreach((kv:(String,Any)) => println(kv))
  println("===================================")
  map1.foreach(kv => println(kv))

  println("===================================")
  // 分别遍历
  map1.keys.foreach((key:String) => {
    println(s"key: ${key} and value : ${map1.get(key)} vales2: ${map1.getOrElse(key,"sad")}")
  })

  // 安全的打印出不存在的key对应的value
  println(map1.getOrElse("d", "sad"))

  // 另外一种简单写法，有的话，直接返回对应value，否则抛异常
  println("===================================")
  println(map1("a"))
  println(map1("z"))



}
