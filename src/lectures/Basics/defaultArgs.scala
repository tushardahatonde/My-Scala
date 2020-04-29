package lectures.Basics

object defaultArgs extends App {

  def trFact(n:Int,acc:Int = 1):Int =    // we provided default value for acc
    if (n<=1) acc
    else trFact(n-1,n*acc)
val fact = trFact(5)
  println(fact)
}
