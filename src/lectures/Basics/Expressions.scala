package lectures.Basics

object Expressions extends App {

  val x = 1 + 2 //EXPRESSIONS: expressions are evalueted to value and they have a type
  //println(x)
  //println(2 + 3 * 4) //MAP EXPRESSIONS
  //println(1 == x)
  //println(!(1 == x))
  var variable = 2
  variable += 3 // also works with -= , *= , /+
  //println(variable)


  /* Instructions vs Expressions
Instructions: is tell the computer to do
Expressions: is a value/ evaluated
*/
  // IF EXPRESSION
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)
  println(if(aCondition) 5 else 3)

  var i = 0
  while (i<5) {
    i += 1
    println(i)
  }
}
