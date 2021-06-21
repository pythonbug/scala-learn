package day12

/**
 * 类的主构造器和辅助构造器
 */
object Test7 {
  def main(args: Array[String]): Unit = {
    var alien = new Alien // 只调用主构造器
    var alien2 = new Alien("ET") // 调用主构造器和辅助构造器1
    var alien3 = new Alien("ET",7) // 调用主构造器,辅助构造器1和辅助构造器2

  }

}

class Alien() {
  var name: String = _
  var age: Int = _
  println("调用了主构造器")

  /**
   * 辅助构造器1
   * 需要先调用主构造器，
   * 无论主构造器还是辅助构造器
   * 都用this来表示
   * 这种方法不用返回值，不用加 = 号了
   */
  def this(name: String) {
    this() // 调用主构造器
    println("调用辅助构造器1")
    this.name = name
  }

  def this(name:String,age:Int){
    // 调用一下辅助构造器1，间接的调用主构造器
    this(name)
    println("调用辅助构造器2")
    this.age = age
  }
}
