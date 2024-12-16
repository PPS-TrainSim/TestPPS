object asd {
  val a = 1
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }
}

class Person() {
  val name = "John"
  val age  = 30

  def greet() = {
    println(s"Hello, my name is $name and I am $age years old.")
  }

  def greet2() = {
    println(s"Hello, my name is $name and I am $age years old.")
  }

}
