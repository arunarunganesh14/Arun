object ForLoop1 {
   def main(args: Array[String]) {
      var counter: Int=0;
      
      for(counter <- 1 to 1000000)
        print(counter + " ");
    
      // to print new line
      println();
   }
}
