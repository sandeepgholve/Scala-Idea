import week1.Person
object session {
  println("Hello Scala")
  val person = new Person("Sandeep Gholve", 32)
  print(person)
  println("Welcome to the Scala worksheet")

	// Version #1
  def sqrt_v1(x: Double): Double = {

    def abs(x: Double): Double = if (x < 0) -x else x
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    def isGoodEnough(guess: Double, x: Double) =
      abs(guess * guess - x) / x < 0.001

    sqrtIter(1.0, x)
  }

	// Version #2 .. here we don't need to pass x to inner functions as its by default available
  def sqrt_v2(x: Double): Double = {

    def abs(x: Double): Double = if (x < 0) -x else x
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def improve(guess: Double) =
      (guess + x / guess) / 2

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    sqrtIter(1.0)
  }

  sqrt_v1(4)
  sqrt_v1(1e60)
  sqrt_v1(1e-6)
  sqrt_v1(16)
  sqrt_v2(2)
  sqrt_v2(4)
  sqrt_v2(1e60)
  sqrt_v2(1e-6)
  sqrt_v2(16)
}