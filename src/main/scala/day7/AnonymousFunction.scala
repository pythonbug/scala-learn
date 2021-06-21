package day7

/**
 * SCALA中的函数
 */
object AnonymousFunction {
  def main(args: Array[String]): Unit = {
    val fun = (name: String) => {
      println(name)
    }
    fun("你大爷哦")
    println("=====================================")

    // 匿名函数当参数
    def f0(func: String => Unit): Unit = {
      func("你大爷2")
    }

    f0(fun)
    println("=====================================")
    f0((name: String) => {
      println(name)
    })

    // 匿名函数的简写
    /**
     * 我们定义f0的参数的时候确定了其参数 func的类型 是String => Unit
     * 所以，当我们实际传入参数的时候，就没有必要再把 name:String这个参数类型了
     * 所以，修改成如下格式
     */
    println("=====================================")
    f0((name) => {
      println(name)
    })

    /**
     * 当参数只有一个的时候，括号可以省略，没有参数，或者多个参数都不能省略括号
     * 所以，再次简化变成下面格式
     */
    println("=====================================")
    f0(name => {
      println(name)
    })

    /**
     * 如果函数体只有一行，则大括号也可以省略
     */
    println("=====================================")
    f0(name => println(name))

    /**
     * 若参数只出现一次，则参数可以省略，后面可以用_代替
     */
    println("=====================================")
    f0(println(_))

    /**
     * println是函数体，不是调用，则连_也可以省略不写
     */
    println("=====================================")
    f0(println)

  }

}
