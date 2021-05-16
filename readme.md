# 学习SCALA的笔记

## Lesson1
伴生对象的作用，完全的面向对象执行者，可以实现类似于JAVA里面的static功能。

## Lesson2

[添加scala源码](https://github.com/scala/scala/archive/v2.12.11.tar.gz)；

[scala的API文档](https://downloads.lightbend.com/scala/2.12.11/scala-docs-2.12.11.zip)。

## Lesson3

- 1 变量用var修饰，常量用val修饰

- 2 声明的同时必须也要赋值

- 3 很显然，var修饰的变量的值可以改变；但是val常量的值不能改变

- 4 val xxx: 变量类型 = xxx 。这种写法不是必须的，因为编译器可以帮助推导出变量类型。当然
这也是为什么第2点必须存在的原因，否则编译器无法进行推导。
  
- 5 变量的类型一旦确定之后，下面再次赋值的时候，如果给了一个其他类型的值，就会报错。
这里只提到了变量，因为常量本身就不该有第二次赋值。
  
## Lesson4

