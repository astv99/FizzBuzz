object FizzBuzz {
  def main(args: Array[String]) {
    for (i <- 1 to 100) {
      if ((i % 3 == 0) && (i % 5 == 0)) print("fizzbuzz ")
      else if (i % 3 == 0) print("fizz ")
      else if (i % 5 == 0) print("buzz ")
      else print(i + " ")
    }
  }
}