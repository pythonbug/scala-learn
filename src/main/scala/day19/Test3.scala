package day19

/**
 * 集合的基本属性和常用操作
 * 1. 获取集合长度
 * 2. 获取集合大小
 * 3. 循环遍历
 * 4. 迭代器
 * 5. 生成字符串
 * 6. 是否包含
 */
object Test3 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4)
    val set1 = Set("a", "b", 34, 56)

    println("=========1 获取集合长度===============")
    println(list1.length)
    println("=========2. 获取集合大小===============")
    println(set1.size)

    println("=========3. 循环遍历===============")
    for(ele <- list1) println(ele)
    for(ele <- set1) println(ele)

    println("=========4. 迭代器===============")
    for(ite <- list1.iterator) println(ite)
    for(ite <- set1.iterator) println(ite)

    println("=========5. 生成字符串===============")
    println(list1)
    println(set1)

    println("=========6. 是否包含===============")
    println(list1 contains 5 )
    println(set1 contains "aaa" )


  }

}
