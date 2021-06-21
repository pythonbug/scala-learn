package day6

/**
 * 参数
 */
object TestFunction01 {
  def main(args: Array[String]): Unit = {
    // 1 可变参数
    def f1(name: String*): Unit = {
      println(s"name= ${name}")
    }

    f1("张三", "李四", "王二麻子")

    println("============================")

    // 2 可变参数放到最后
    def f2(age: Int, name: String*): Unit = {
      println(s"${age}岁的${name}是个好人")
    }

    f2(12, "金扶民", "杨凯", "周明干")

    println("============================")

    // 3 参数默认值, 当只有一个参数的时候可以不用传, 当有多个参数,其中一个参数是有默认值的话
    // 则可以使用带名参数去直接指定
    // 多个参数,其中一个参数是有默认值的
    def f3(name: String = "lalala", age: Int): Unit = {
      println(s"${name}已经${age}岁了")
    }

    f3(age = 12)

    println("============================")

    // 只有一个参数,且这个参数是有默认值的,那么可以直接不传
    def f4(name: String = "我你大爷"): Unit = {
      println("name=" + name)
    }
    // 可以直接不传, 就是用的默认值, 多个参数的话
    f4()

  }

}
