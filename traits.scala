trait MyTrait
{
    var value: Int 
    var Height = 10
    val Width = 30
}
class MyClass extends MyTrait
{
    var value = 12
    Height = 40
    override val Width = 10
    def Display()
    {
        printf("Value:%d", value);
        printf("\nHeight:%d" ,Height);
        printf("\nWidth:%d", Width);
    }
}
object Main
{
    def main(args: Array[String])
    {
        val obj = new MyClass();
        obj.Display();
    }
}
