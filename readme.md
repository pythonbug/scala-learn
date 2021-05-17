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
字符串的一些问题：

见lesson4的代码

## Lesson5
简单的文件读写操作

## Lesson6 重要
scala的数据类型

实线表示是其子类，虚线表示可以进行隐式转换。

随着这个数据类型图，带来了三个问题：

Unit、Null、Nothing之间的关系和区别！

Unit我们已经遇见过，当函数不返回数据的时候，相当于java里面的void。

Unit里面有唯一的对象，就是()，表示一种空值。

Null的对象只有一个null，是所有引用类的子类。

Nothing是所有数据类型的子类，当一个函数有返回值，但是不明确这个返回值类型的时候，

我们用Nothing


