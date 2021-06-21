package day15

object Test1 {
  def main(args: Array[String]): Unit = {
    val registerUser = new RegisterUser("alice","123456")
    registerUser.addUser()
  }

}

class User(val name:String,val password:String)

trait UserDao{

  _:User =>

  def addUser():Unit = {
    println(s"inser into user: ${name}")
  }
}

class RegisterUser(name:String, password:String) extends User(name, password) with UserDao{

}