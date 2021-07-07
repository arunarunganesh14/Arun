class Student(id:Int, name:String){  
    def getRecord(){  
        println(id+" "+name);  
    }  
}  
  
object MainObject{  
    def main(args: Array[String]){  
        var student1 = new Student(101,"Arun");  
        var student2 = new Student(102,"Varun");  
        student1.getRecord();  
        student2.getRecord();  
    }  
}  
