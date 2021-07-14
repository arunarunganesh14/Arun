object impureFunction
{
  val constant = 10.2;
  def constantMul(value:Int): Double = {
    val result = value*constant;
    return (result);
  }

  def main(args: Array[String]) {
    println("The result of constant multiplier is: " + constantMul(34))
  }

}
