class polymorphism
{
    def fun(p:Int, q:Int)
    {
        var Sum = p + q;
        println("Sum function 1 :" + Sum);
    }
    def fun(p:Int, q:Int, r:Int)
    {
        var Sum = p + q + r;
        println("Sum function 2 :" + Sum);
    }
}
object Main 
{
    def main(args: Array[String]) 
    {
    var obj = new polymorphism();
    obj.fun(5, 15);
    obj.fun(5, 10, 15);
    }
}
