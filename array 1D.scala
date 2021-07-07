class ArrayExample{  
    var arr = Array(1,2,3,4,5)      // Creating single dimensional array  
    def show(){  
        for(a<-arr)                       // Traversing array elements  
            println(a)  
        println("Third Element  = "+ arr(2))        // Accessing elements by using index  
    }  
}  
  
object MainObject{  
    def main(args:Array[String]){  
        var a = new ArrayExample()  
        a.show()  
    }  
}  
