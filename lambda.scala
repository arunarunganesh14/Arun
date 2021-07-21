object lambda
{
def main(args:Array[String])
{ 
    val ex1 = (x:Int) => x + 5
    val ex2 = (x:Int, y:Int) => x * y
    println(ex1(4))
    println(ex2(6, 3))
}
}
