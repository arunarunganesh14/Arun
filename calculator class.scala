class Calculator {
  def +(a:Int,b:Int):Int =a+b
  def -(a:Int,b:Int):Int = a-b
  def *(a:Int,b:Int):Long = a*b

  def /(a:Int,b:Int):Int =
  {
    require(b !=0, "denominator can not be 0")
    a/b
  }
  def %(a:Int,b:Int):Int = a%b

}
object CalculatorDemo
{
  def main(args: Array[String]): Unit =
  {
    val calc = new Calculator()

    var scanner = new Scanner(System.in)
    val a = scanner.nextInt
    val b= scanner.nextInt
    println(a)
    println(b)

    println("Addition: " + calc.+(a, b))
    println("Subtraction: " + calc.-(a, b))
    println("Multiplication: " + calc.*(a, b))
    println("Division: " + calc./(a, b))
    println("Modulo Division: " + calc.%(a, b))

  }
}
