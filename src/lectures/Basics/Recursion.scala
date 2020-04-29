package lectures.Basics

import scala.annotation.tailrec

object Recursion extends App {

  def tailRecursion(n: Int): BigInt = {
    @tailrec
    def tailRecursionHelper(x: Int, accumalator: BigInt): BigInt =
      if (x < 1) accumalator
      else tailRecursionHelper(x - 1, x * accumalator) // TAIL RECURSION = use recursive call as LAST expression

    tailRecursionHelper(n, 1)
  }

  /*
tailRecursion(10) = tailRecursionHelper(10,1)
 =tailRecursionHelper(9,10*1)
 =tailRecursionHelper(8,9*10*1)
 =tailRecursionHelper(7,8*9*10*1)
 =...
 =tailRecursionHelper(2,3*4*5*6*7*8*9*10*1)
 =tailRecursionHelper(1,2*3*4....10*1)
 */
  println(tailRecursion(5000))

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION

  // PROBLEM: Concatenate a string n times
  def concatinateTailRec(aString: String, n: Int, accumalator: String): String =
    if (n<=0) accumalator
    else concatinateTailRec(aString,n-1,aString + accumalator)
  println(concatinateTailRec("Tushar ",5,""))

}
