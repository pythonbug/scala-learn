package day24

object Test_tuplecase extends App {

  for (tuple <- List(
    (0, 1),
    (3, 4, 5),
    (7, 8, 9, 10),
  )) {
    val result = tuple match {
      case (x, y) => "二元组"
      case (x, _, _) => "三元组"
      case _ => "好多元组"
    }

    println(result)
  }

}
