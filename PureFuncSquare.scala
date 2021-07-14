object PureFunction {
  def main(args: Array[String]): Unit = {

    def square(a: Int) = {
      var b: Int = a * a;
      println("Square of the number is " + b);
      println("Number is " + a);
    }

    square(6)
  }

    var l=List(2,4,6,7)
    var l2= for(i<-l) yield i*i
    println(l2)
    println(l)
}
