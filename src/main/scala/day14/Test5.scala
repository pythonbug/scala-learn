package day14

/**
 * 特质的钻石叠加
 * 特质1 可口可乐
 * 特质2 百事可乐
 * 特质1,2 的共同特质 水
 */
object Test5 {
  def main(args: Array[String]): Unit = {
    val myDrink = new MyDrink
    println(myDrink.info())
  }

}

trait Water{
  def info() :String = "水"
}

trait CocaCola extends Water {
  override def info() :String = "可口可乐 "+ super.info()
}

trait PepsiCola extends Water {
  override def info() :String = "百事可乐 "+ super.info()
}

class MyDrink extends PepsiCola with CocaCola{
  override def info() :String = "我喝的是 " + super.info()
}
