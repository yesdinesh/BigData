

object scalademo {
  def main(args: Array[String]) {

    // With Arguments
    def palindrome(str: String) = str == str.reverse.toString()
    println(palindrome("madam"))

    //Conditional Statements
    def subtract(x: Int, y: Int) = if (x > y) x - y else 0
    println(subtract(18, 20))

    // Lambda (nameless functions)
    val square = (x: Int) => x * x;
    println(square(6))

    // While Loop:-
    var x = 0
    while (x < 5) {
      println(x);
      x += 1;
    }

    // Do While:-
    var i = 0; do { println("Hi "); i = i + 1; } while (i < 5);

    //For Loop:-
    for (x <- 1 to 5) {
      println(x);
    }

    // Classes
    class Employee(id: Int, val name: String, address: String, var salary: Long) {
      println(name + " is working in Big data project salary with " + salary + " ")
    }

    val employee = new Employee(1, "Dinesh", "Kallakurichi", 10000)

    // Classes Ex:2
    class student {
      var id = 0
      var name = null
      def display(id: Int, name: String) {
        println(id + name)
      }
    }
    var s1 = new student(); s1.display(100, " Spark ")

    // Collection
    // List
    val places_List = List("chennai", "pune", "Banglore", "Delhi", "Mumbai")
    val places_List2 = "Salem" :: places_List
    println(places_List2)
    //Sets
    val places_set = Set("chennai", "chennai", "pune", "Banglore", "Delhi", "Mumbai")
    println(places_set)
    //Map
    val test_map = Map((1, "Dinesh"), 2 -> "Kumar", 4 -> "Hi Scala")
    println(test_map(1))
    //Tuples
    val places_tuple = (1, "hello")
    println(places_tuple._2)

    //Singleton Objects
    object HelloWorld {
      def main(args: Array[String]) {
        println("Hey world!")
      }
    }

    HelloWorld.main(null)

    // Ex:2
    object SO {
      def greetings() {
        println("Hello I am Scala")
      }
    }

    SO.greetings()

    // Companion Objects
    class Main {
      def sayHelloWorld() { println("Hello World"); }
    }

    object Main {
      def sayHi() { println("Hi! "); }
    }

    var aMain: Main = new Main();
    aMain.sayHelloWorld();

    Main.sayHi();

    // case class
    case class person(name: String, age: Int, income: Double)
    val p1 = person("yesdinesh", 28, 2.0)
    println(p1.age)

    // Pattern Matching
    def matching(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
    }
    println(matching(8))

    //Higher Order Function
    val salaries = Seq(20000, 70000, 40000)
    val doubleSalary = (x: Int) => x * 2
    val newSalaries = salaries.map(doubleSalary)
    println(newSalaries)

    //Anonymous functions
    def anon_fun {
      var r1 = (a: Int, b: Int) => a + b
      var r2 = (_: Int) * (_: Int)
      println(r1(10, 10))
      println(r2(10, 10))
    }
    anon_fun

    //Closures
    val inc = 10
    def incre(x: Int) = x + inc
    println(incre(20))

    //Currying Functions
    def add(x: Int, y: Int) = x + y
    println(add(1, 3))

    def addc(x: Int)(y: Int) = x + y
    println(addc(1)(3))
    val z = addc(1)_
    println(z(5))

  }

}