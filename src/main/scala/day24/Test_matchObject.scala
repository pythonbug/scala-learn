package day24

object Test_matchObject {
  def main(args: Array[String]): Unit = {
    val s = new Student("alice", 21)

    val result = s match {
      case Student("alice",19) => "yes"
      case _ => "else"
    }

    println(result)

  }

}

class Student(val name: String, val age: Int)

object Student {
  def apply(name: String, age: Int): Student = new Student(name, age)
  def unapply(s:Student):Option[(String,Int)] = {
    if(s == null){
      None
    }else{
      Some((s.name,s.age))
    }
  }
}