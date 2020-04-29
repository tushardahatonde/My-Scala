package lectures.Basics

object Functions extends App {
  def aFunction(a: String, b: String): String = {
    a + " " + b
  }

  println(aFunction("Hello", "Tush"))

  // WHEN YOU NEED LOOPS, USE RECURSION

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }
  println(aRepeatedFunction("Tush ",6))

  def a(name:String,age:Int)={
    "Hi my name is " +name +" and I am " +age  +"years old."
  }
  println(a("Tushar",28))

  def aFactorial(n:Int):Int =
    if (n<=1) 1
    else n* aFactorial(n-1)
  println(aFactorial(5))

  def aFibonacci(n:Int):Int=
    if (n<=2)1
    else aFibonacci(n-1) + aFibonacci(n-2)
  println(aFibonacci(8))

}
