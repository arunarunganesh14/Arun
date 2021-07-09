object ExampleVarDecAndAssin {
   def main(args: Array[String]) {
      
      var (name: String, age: Int) = Pair("Arun",23);

      //print values
      println("Name: "+name);
      println("Age:  "+age);
      
      //declaration without specifying data type
      var (address,mobile)=Pair("Chennai, India",1234567890);
      
      //print values
      println("Address: "+address);
      println("Mobile:  "+mobile);      
            
   }
}
