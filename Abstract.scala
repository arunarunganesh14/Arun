
abstract class Abstclass
{
    def code
    def handson()
    { 
        println("Scala Handson")
    }
}
class Abst extends Abstclass
{
    def code()
    {
        println("Welcome to Scala")
    }
} 
object Main 
{
    def main(args: Array[String]) 
    {
        var obj = new Abst ();
        obj.handson()
        obj.code()
    }
}
