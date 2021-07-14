object Primenumber
{
     def main(args:Array[String]) {

       val scan = new Scanner(System.in)
       println("Enter the number:")
       val num = scan.nextInt()
       primeDemo(num)
     }
   def primeDemo(n:Int)
  {
    var k=0
    if(n==1)
      println("not a prime number")
    else
      {
        for(i<- 2 until n-1)
        {
          if (n % i == 0)
            k = k + 1
        }
              if(k!=0)
                  println("not a prime number")
              else
                  println("prime number")
         }
      }
}
