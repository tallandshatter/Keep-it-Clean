1. import java.util.Random
2. 
fun main(args: Array<String>) {
    3.   println("Keep it Clean!")
    4.   
    5.   // Generate a random number
    6.   val random = Random().nextInt(100)+1 
    7.   
    8.   // Print out a random number
    9.   println("Random Number: $random")
    10.   
    11.  // Create a loop that will go though our array of objects and print out the data
    12.  val vegetables = arrayOf("Carrots", "Celery", "Broccoli", "Cauliflower", "Mushrooms", "Zucchini")
    13.  for (vegetable in vegetables) {
    14.      println("Vegetable: $vegetable")
    15.  }
    16.   
    17.  // Create a function to calculate the sum of two numbers
    18.  fun addNumbers(a: Int, b: Int): Int {
    19.      return a + b
    20.  }
    21.  val result = addNumbers(2, 3)
    22.  println("2 + 3 = $result")
    23.   
    24.  // Create a simple class to represent a Person
    25.  class Person(val name: String, var age: Int) {
    26.      fun sayHello() = println("Hello, my name is $name")
    27.  }
    28.  val john = Person("John", 20)
    29.  john.sayHello()
    30.  john.age = 21
    31.  println("John's age is now ${john.age}")
    32.   
    33.  // Create an array of integers
    34.  val numbers = intArrayOf(7, 8, 9, 10)
    35.   
    36.  // Print out the numbers in the array
    37.  for (number in numbers) {
    38.      println("The number is: $number")
    39.  }
    40.   
    41.  // Create a while loop that will print out "Clean!" 10 times
    42.  var i = 0
    43.  while (i < 10) {
    44.      println("Clean!")
    45.      i++
    46.  }
    47.   
    48.  // Create a map with key value pairs
    49.  val mapOfNames = mapOf("John" to 22, "Sally" to 24, "Bill" to 26)
    50.   
    51.  // Print out the map
    52.  for ((name, age) in mapOfNames) {
    53.      println("$name is $age years old")
    54.  }
    55.   
    56.  // Create an arraylist of Strings
    57.  val shoppingList = arrayListOf("Milk", "Eggs", "Butter", "Flour")
    58.   
    59.  // Print out the list
    60.  for (item in shoppingList) {
    61.      println("Shopping List Item: $item")
    62.  }
    63.   
    64.  // Create a do while loop that prints out numbers from 1 to 10
    65.  var x = 1
    66.  do {
    67.      println("Number: $x")
    68.      x++
    69.  } while (x <= 10)
    70.   
    71.  // Create a switch statement that prints out a message based on a number
    72.  val number = 5
    73.  when (number) {
    74.      0 -> println("zero")
    75.      1 -> println("one")
    76.      2 -> println("two")
    77.      3 -> println("three")
    78.      4 -> println("four")
    79.      5 -> println("five")
    80.      else -> println("unknown number")
    81.  }
    82.   
    83.  // Create a try catch block to gracefully handle an exception
    84.  try {
    85.      val divisor = 0
    86.      val result = 100 / divisor
    87.      println("The result is $result")
    88.  } catch (e: ArithmeticException) {
    89.      println("An arithmetic exception occurred: ${e.message}")
    90.  }
    91.   
}