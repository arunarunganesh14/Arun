class Employee{  
    var salary:Float = 10000  
}  
  
class Programmer extends Employee{  
    var bonus:Int = 2000  
    println("Salary = "+salary)  
    println("Bonus = "+bonus)  
}  
  
object MainObject{  
    def main(args:Array[String]){  
        new Programmer()  
    }  
} 
