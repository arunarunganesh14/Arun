object vararg 
{ 
    def main(args: Array[String])
    { 
        println("Sum is " + sum(5, 3, 1000, 2000, 3000)); 
    } 
    def sum(a :Int, b :Int, args: Int *) : Int =
    {
        var result = a + b
      
        for(arg <- args)
        {
            result += arg
        }
      
        return result
    }
} 
