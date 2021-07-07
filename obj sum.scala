class Arithmetic{  
    def add(a:Int, b:Int){  
        var add = a+b;  
        println("sum = "+add);  
    }  
}  
  
object MainObject{  
    def main(args:Array[String]){  
        new Arithmetic().add(10,10);  
  
    }  
} 
