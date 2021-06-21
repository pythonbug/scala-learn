package day1

object Zifuchuan {

  def main(args: Array[String]): Unit = {
    val name = "wangwen"
    val age = 12

    // 普通加法字符串
    println("学生" + name + "，已经" + age + "岁了")

    // 占位符
    printf("学生%s，已经%d岁了\n", name, age)

    // 类似于shell的那种
    println(s"学生${name}，已经${age}岁了")

    // 对小数的截取
    val num = 12.6489
    println(f"数字截取小数点两位是${num}%40.2f")
    // 这里的40指的是整个数字的长度，若实际上整个数据长度没有40的话，则会在前面补上空格
    // 假设实际的数据长度，大于40的话，不要有任何担心。会正常显示
    // 2指的是保留的小数，这里直接自动四舍五入了

    // 无视一切符号的输出
    println(raw"数字截取小数点两位是${num}%40.2f")

    // 三引号输出，一般用于sql的编写上
    val sql =
      s"""
         |select *
         |from student
         |where 1=1
         |and name = ${name}
         |and age = ${age}
         |
         |""".stripMargin

    println(sql)


  }

}
