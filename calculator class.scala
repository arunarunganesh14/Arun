class Calculator {
  def +(a:Int,b:Int):Int =a+b
  def -(a:Int,b:Int):Int = a-b
  def *(a:Int,b:Int):Long = a*b

  def /(a:Int,b:Int):Int =
  {
    require(b !=0, "denominator can not be 0")
    a/b
  }
}
   val calc = new Calculator()

  println("Addition: " + calc.+(15, 3))
  println("Subtraction: " + calc.-(15, 3))
  println("Multiplication: " + calc.*(15, 3))
  println("Division: " + calc./(15, 3))
