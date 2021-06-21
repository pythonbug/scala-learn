package day24

import javafx.scene.Parent

object Test_end extends App {
  def test[A <:Parent](a:Parent):Unit={

  }

  test[Child](new Child)

}


class Parent{}

class Child extends Parent {}