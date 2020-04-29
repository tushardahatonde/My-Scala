package lectures.OOP

object OOBasics extends App{
  // constructor
  class Person(name: String, val age: Int = 0) {
    // body
    val x = 2

    println(1 + 3)

    // method
    def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

    // overloading
    def greet(): Unit = println(s"Hi, I am $name")

    // multiple constructors
    def this(name: String) = this(name, 0)
    def this() = this("John Doe")
  }

  val person = new Person("John", 26)
  println(person.x)
  person.greet("Daniel")
  person.greet()

  class Writer(name:String,surname:String,val year:Int){
    def fullName = name + "" + surname
  }

  class Novel(name:String,year:Int,author:Writer) {
    def authorAge = year - author.year
    def isWrittenBy(author: Writer) = author == this.author
    def copy(newYear: Int): Novel = new Novel(name, newYear, author)
  }
    val author = new Writer("Charles", "Dickens", 1812)
    val novel = new Novel("Great Expectations", 1861, author)

    println(novel.authorAge)
    println(novel.isWrittenBy(author))


}
