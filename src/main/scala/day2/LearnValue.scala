package day2

object LearnValue {
  def main(args: Array[String]): Unit = {
    // 1 在scala里面，数字默认是int类型的
    // 假设有明显超过int型的，就会报错
    val a = 12333333333L
    println(a)

    // 编译器会自动推断结果是否超出，只在计算公式不存在变量，只为数字的时候
    // 下面的红色只是idea里面scala插件的问题，还是会正常执行的
    val b: Byte = 30 + 20
    println(b)

    // 当计算式子中有变量的时候，就无法推断了，只能在运行的时候才算得出来，所以就会导致编译不通过
    // 例如下面这种就无法判断b+10的值是否已经超过Byte所能表示的范围，且类型为Int，所以就编译不通过
    //    val c: Byte = b+10
    //    println(c)

    // 字符类型
    val e: Char = '1'
    println(e) // 这不是数字1，这是字符1，不能混淆

    // 查看字符底层的ASCII码
    val e2: Int = e
    println(e2) // 49

    // 将数字转换成字符
    val e3 = (e2 + 1).toChar
    println(e3) // 字符2 ，不是数字2

    // main方法里面也可以定义方法
    def m1(): Unit = {
      println("m1方法被调用")
    }

    val m = m1()
    println(m)



  }

}
