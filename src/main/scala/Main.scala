import Monads._

object Main extends App {

  val hej = "hejsaddn"

  val name = "martin"
  val age = 31

  val isOld = if (age > 20) "old" else "young"

  val block = {
    val name = "hej"
  }

  def myFunc(x: Int, y: Int): Int = y + x

  def largerFunc(x: Int, y: Int): String = {
    val multi = x * y
    s"The number is $multi"
  }


  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n-1)
  }

  val valu = factorial(5)

  println(valu)

  println(name + " is " + age)
}