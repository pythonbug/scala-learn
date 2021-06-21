package day17

import scala.collection.mutable

/**
 * 可变的数据集
 */
object Test4 extends App{

  var set1 = mutable.Set('我','是')
  /*
  添加元素，
  +
  +=
  add
  * */

  set1 + '你'
  println(set1)

  set1 += '你'
  println(set1)

  set1.add('他')
  println(set1)

  /*删除元素*/
  set1.remove('他')
  println(set1)

  /*合并元素*/
  var set2 = mutable.Set('a','b')
  set1 ++= set2
  println(set1)
  println(set2)





}
