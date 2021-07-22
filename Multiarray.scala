object multiarr
{
    def main(args:Array[String]) 
    {
        val rows = 2
        val cols = 3
        val names = Array.ofDim[String](rows, cols)
        names(0)(0) = "11"
        names(0)(1) = "22"
        names(0)(2) = "33"
        names(1)(0) = "44"
        names(1)(1) = "55"
        names(1)(2) = "66"
        for
        {
            i <- 0 until rows
            j <- 0 until cols
        }
        println(s"($i)($j) = ${names(i)(j)}")
    }
}
