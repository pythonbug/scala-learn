package day13

/**
 * java风格的构造参数
 */
object Test1 {
  def main(args: Array[String]): Unit = {
    // 1 java风格的构造参数
    val person1 = new Person1
    println(s"name = ${person1.name}, age = ${person1.age}")
    // 重新赋值
    person1.name = "bob"
    person1.age = 21
    println(s"name = ${person1.name}, age = ${person1.age}")

    // 2 scala风格的构造参数
    val person2 = new Person2("alice", 15)
    println(s"name = ${person2.name}, age = ${person2.age}")
    person2.name = "kate"
    person2.age = 23
    println(s"name = ${person2.name}, age = ${person2.age}")

    // 3 scala风格的构造参数，但是用的val
    val person3 = new Person3("alice", 15)
    println(s"name = ${person3.name}, age = ${person3.age}")
    // 无法被修改
    //    person3.name = "kate"
    //    person3.age = 23
    //    println(s"name = ${person3.name}, age = ${person3.age}")

    // 4 scala风格的构造参数，用上辅助构造
    val person4 = new Person4("alice2", 18)
    println(s"name = ${person4.name}, age = ${person4.age}, school = ${person4.school}")

    val person4_1 = new Person4("alice2", 18,"北大青鸟")
    println(s"name = ${person4_1.name}, age = ${person4_1.age}, school = ${person4_1.school}")

  }
}

class Person1 {
  var name: String = _
  var age: Int = _
}

class Person2(var name: String, var age: Int)

class Person3(val name: String, val age: Int)

class Person4(var name: String, var age: Int) {
  var school: String = _

  def this(name: String, age: Int, school: String) {
    // 调用主构造
    this(name, age)

    this.school = school

  }
}

