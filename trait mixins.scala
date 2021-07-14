trait Text
{ 
    def txt() 
}
abstract class LowerCase
{ 
    def lowerCase() 
} 
class Myclass extends LowerCase
{
    def lowerCase()
    { 
        val y = "SCALA"
        println(y.toLowerCase()) 
    } 
    def txt()
    {                                     
        println("I like Scala") 
    } 
} 
object scala
{ 
    def main(args:Array[String])
    { 
        val x = new Myclass() with Text
        x.lowerCase() 
        x.txt() 
    } 
}
