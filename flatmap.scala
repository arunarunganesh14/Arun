object flatmap
{ 
    def main(args:Array[String])
    {
        val portal = Seq("Scala", "flatmap", "code")
        
        val result = portal.flatMap(_.toUpperCase)
        
        println(result)
    }
}
