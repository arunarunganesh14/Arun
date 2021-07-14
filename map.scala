object map
{
    def main(args:Array[String])
    {
        val mapIm = Map("Kumar" -> 30,
                        "Arun" -> 20,
                        "Ganesh" -> 10)

        val arun = if(mapIm.contains("Arun"))
                        mapIm("Arun") else 0
                          
        val ganesh = if(mapIm.contains("Ganesh"))
                        mapIm("Ganesh") else 0
  
        println("Arun:" + arun)
        println("Ganesh:" + ganesh)
    }
} 
