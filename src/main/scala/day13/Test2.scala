package day13

object Test2 {
  def main(args: Array[String]): Unit = {
    // 1 只调用父类的主构造方法
    val animal = new Animal("yellow",1)
    animal.printInfo()

    // 2 调用父类的主构造方法和辅助构造方法
    val animal2 = new Animal("yellow",1,4)
    animal2.printInfo()

    // 3 调用父类的主构造方法和子类的主构造方法
    val dog = new Dog("black",11)
    dog.printInfo()

    // 4 调用父类的主构造方法和子类的主构造方法，子类的辅助构造方法
    val dog2 = new Dog("black",11,"大黄")
    dog2.legs = 5
    dog2.printInfo()
  }

}

class Animal(var color:String,var age:Int){

  var legs:Int = _
  println("1. 调用父类主构造方法")

  // 辅助构造方法
  def this(color:String,age:Int,legs:Int){
    // 先调用主构造方法
    this(color,age)
    println("2. 调用父类辅助构造方法")
    this.legs = legs
  }

  def printInfo(): Unit ={
    println(s"动物的颜色：${color}，年龄是: ${age}，有${legs}条腿")
  }
}

class Dog(color:String,age:Int) extends Animal(color,age) {
  println("3. 调用子类主构造方法")
  var name:String = _

  def this(color:String,age:Int,name:String){
    // 调用主构造方法
    this(color,age)
    println("4. 调用子类辅助构造方法")
    this.name = name
  }

  override def printInfo(): Unit = {
    println(s"动物的颜色：${color}，年龄是: ${age}，有${legs}条腿，叫${name}")
  }
}

